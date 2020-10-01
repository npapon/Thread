package Join;

public class MainJoin {

    public static void main( String[] args ) {

        Thread.currentThread().setName( "Principal" );
        System.out.println( "Demarrage du thread " + Thread.currentThread().getName() );

        Manger manger = new Manger();
        Marcher marcher = new Marcher();
        Thread threadManger = new Thread( manger );
        threadManger.setName( "Manger" );
        Thread threadMarcher = new Thread( marcher );
        threadMarcher.setName( "Marcher" );
        threadManger.start();

        threadMarcher.start();
        try {
            threadManger.join();
            threadMarcher.join();
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println( "Jarrive au lycée" );
    }

}
