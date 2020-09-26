package priorité;

public class MainPriorite {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        Compteur compteur = new Compteur();
        Thread threadCompteur1 = new Thread( compteur );
        Thread threadCompteur2 = new Thread( compteur );
        Thread threadCompteur3 = new Thread( compteur );

        threadCompteur1.start();
        threadCompteur2.start();
        threadCompteur3.start();

        threadCompteur1.setPriority( Thread.MIN_PRIORITY );
        threadCompteur2.setPriority( Thread.NORM_PRIORITY );
        threadCompteur3.setPriority( Thread.MAX_PRIORITY );

        try {
            Thread.sleep( 5000 );
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        compteur.setThreadActif( false );
    }

}
