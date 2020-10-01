package deadLock;

public class Verre {

    // permet de savoir si le verre est plein
    private boolean plein = false;

    // la carafe qui va remplir le verre
    private Carafe  carafe;

    // le verre se remplit si la carafe est pleine
    public synchronized void remplir() {
        if ( carafe.isPlein() ) {
            plein = true;
            carafe.setPlein( false );

        }
    }

    // le verre se vide si la carage est vide
    // et on reremplit la carafe
    public synchronized void vider() {
        if ( !carafe.isPlein() ) {
            plein = false;
            carafe.setPlein( true );

        }
    }

    // tout le monde connaiot l'était de remplissage du verre
    public synchronized boolean isPlein() {
        return plein;
    }

    public void setPlein( boolean plein ) {
        this.plein = plein;
    }

    public Carafe getCarafe() {
        return carafe;
    }

    public void setCarafe( Carafe carafe ) {
        this.carafe = carafe;
    }

}
