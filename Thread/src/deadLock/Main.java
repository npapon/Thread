package deadLock;

public class Main {

    public static void main( String[] args ) {

        // on créé pour nos différents thread une seule carafe et verre
        final Carafe carafe = new Carafe();
        final Verre verre = new Verre();
        carafe.setVerre( verre );
        verre.setCarafe( carafe );

        // on créé 2 objets thread avec carafe et verre
        Runnable carafeApplication = new Runnable() {
            public void run() {
                for ( int i = 0; i < 20; i++ ) {
                    carafe.remplir();
                    carafe.vider();

                }
            }

        };

        Runnable verreApplication = new Runnable() {
            public void run() {
                for ( int i = 0; i < 20; i++ ) {
                    verre.remplir();
                    verre.vider();

                }
            }

        };

        // on créé des tableaux pour accueillir les threads
        Thread[] threadsCarafe = new Thread[5];
        Thread[] threadsVerre = new Thread[5];

        // on les instancie
        for ( int i = 0; i < 5; i++ ) {
            threadsCarafe[i] = new Thread( carafeApplication );
            threadsVerre[i] = new Thread( verreApplication );
        }

        // on les démarre
        for ( int i = 0; i < 5; i++ ) {
            threadsCarafe[i].start();
            threadsVerre[i].start();
        }

        // on laisse les thread finir pour que le main reprenne
        for ( int i = 0; i < 5; i++ ) {
            try {
                threadsCarafe[i].join();
                threadsVerre[i].join();
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        System.out.println( "end of the programme" );

    }

}
