public class TueurDeThreads implements Runnable {

    public boolean finDemandee = false; // le drapeau

    // thread secondaire
    public void run() {
        do {
            System.out.print( "Je " );
            System.out.print( "suis " );
            System.out.print( "un " );
            System.out.println( "thread." );
            // on suppose qu'il est s�curitaire d'arr�ter le thread
            // � cet endroit
        } while ( !finDemandee );
    }

}