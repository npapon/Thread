package interrupt;

public class Combo implements Runnable {

    private int     nombreCombo;
    private int     rapiditeCombo;
    private boolean arretThread = false;

    @Override
    public void run() {

        System.out.println( "Lancement du thread combo :" + Thread.currentThread().getName() );
        while ( !arretThread ) {
            attaquer();
        }

    }

    public void attaquer()

    {

        for ( int i = 0; i <= nombreCombo; i++ ) {
            System.out.println( "Hit " + i + "!!!!!" );

            try {
                Thread.sleep( rapiditeCombo );

                // Lorsque le main appelle t.interrupt();, cela interrompt
                // l'attente du thread « t » et lève l'exception
                // InterruptedException. Il faut donc faire un catch de cette
                // exception
                // et la traiter comme la condition de sortie de boucle (c'est
                // pour ça que l'on fait un break;).

                // Même si le thread n'est pas en attente sur le code bloquant
                // au moment de l'interruption, celui-ci va continuer jusqu'à y
                // arriver.
                // Lorsqu'il arrivera au code bloquant, il lèvera alors
                // l'exception.
            } catch ( InterruptedException e ) {

                System.out.println( "Arret violent du thread" );
                // il faut interrompre une seconde fois

                Thread.currentThread().interrupt();
                // on sort de la boucle
                break;

            }

        }
        arretThread = true;
    }

    public int getNombreCombo() {
        return nombreCombo;
    }

    public void setNombreCombo( int nombreCombo ) {
        this.nombreCombo = nombreCombo;
    }

    public int getRapiditeCombo() {
        return rapiditeCombo;
    }

    public void setRapiditeCombo( int rapiditeCombo ) {
        this.rapiditeCombo = rapiditeCombo;
    }

    public boolean isArretThread() {
        return arretThread;
    }

    public void setArretThread( boolean arretThread ) {
        this.arretThread = arretThread;
    }

}
