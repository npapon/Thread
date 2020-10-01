package deadLock;

/**
 * @author npapo
 *
 */
public class Carafe {

    private boolean plein = false;
    private Verre   verre;

    // si le verre est plein, cela signifie que la carafe est vide donc elle
    // peut se remplir
    // mais on vide le verre aussi en meme temps
    public synchronized void remplir() {
        if ( verre.isPlein() ) {
            plein = true;
            verre.setPlein( false );
        }
    }

    // Si le verre est vide alors cela signifie que la carafe est plein et peut
    // être vider
    // le verre sera alors remplit
    public synchronized void vider() {
        if ( !verre.isPlein() ) {
            plein = true;
            verre.setPlein( true );
        }
    }

    // tout le monde peut savoir l'état de remplissage de la carafe
    public synchronized boolean isPlein() {
        // TODO Auto-generated method stub
        return plein;
    }

    public void setPlein( boolean plein ) {
        this.plein = plein;

    }

    public Verre getVerre() {
        return verre;
    }

    public void setVerre( Verre verre ) {
        this.verre = verre;
    }

}
