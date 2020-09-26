package Yield;

public class Parler implements Runnable {

    private String mot;

    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {

            System.out
                    .println( i + "- " + Thread.currentThread().getId() + " - " + Thread.currentThread().getId() + " - " + mot );
            Thread.yield();
            try {
                Thread.sleep( 1000 );
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    public String getMot() {
        return mot;
    }

    public void setMot( String mot ) {
        this.mot = mot;
    }

}
