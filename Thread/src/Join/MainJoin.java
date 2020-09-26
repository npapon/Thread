package Join;
import Join.Manger;
import Join.Marcher;

public class MainJoin {

    public static void main( String[] args ) {

        Manger manger = new Manger();
        Marcher marcher = new Marcher();
        Thread threadManger = new Thread( manger );
        Thread threadMarcher = new Thread( marcher );
        threadManger.start();

        threadMarcher.start();
        try {
            threadManger.join();
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println( "Jarrive au lycée" );
    }

}
