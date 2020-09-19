public class Main {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        // Bateau bateau = new Bateau();
        // bateau.start();

        System.out.println( "Le programme rend la main même si le thread est pas fini" );

        MyThread monThread = new MyThread();
        Thread thread = new Thread( monThread );
        monThread.setName( "Nicolas" );
        monThread.setRapiditeTraitementEnMiliSecondes( 2000 );

        thread.start();

        monThread.setExit( true );

    }

}
