package Join;

public class Manger implements Runnable {

    public void run() {

        System.out.println( "démarrage du thread " + Thread.currentThread().getName() );
        for ( int i = 0; i < 3; i++ ) {

            System.out.println( i + " Je mange" );

            try {
                Thread.sleep( 1000 );
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}