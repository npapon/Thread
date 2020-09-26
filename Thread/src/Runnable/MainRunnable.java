package Runnable;

public class MainRunnable {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        BateauRunnable bateauRunnable = new BateauRunnable();
        bateauRunnable.setName( "Nicolas" );
        bateauRunnable.setRapiditeTraitementEnMiliSecondes( 2000 );
        Thread thread = new Thread( bateauRunnable );
        thread.start();
        System.out.println( "Thread 1 lancé" );

        BateauRunnable bateauRunnable2 = new BateauRunnable();
        bateauRunnable2.setName( "Valentine" );
        bateauRunnable2.setRapiditeTraitementEnMiliSecondes( 2000 );
        Thread thread2 = new Thread( bateauRunnable2 );

        // thread2.start();
        System.out.println( "Thread 2 lancé" );

        // On fait une pause sur la pile d'excution principale
        try {
            Thread.sleep( 4000 );
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
