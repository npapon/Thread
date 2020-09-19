package bean;

public class Bateau extends Thread {

    public void run() {
        int i = 0;
        while ( i++ < 20 ) {
            System.out.println( "je vogue " + i + " vague(s)" );

            try {
                Thread.sleep( 2000 );
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
