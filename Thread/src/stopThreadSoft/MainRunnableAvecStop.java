package stopThreadSoft;

public class MainRunnableAvecStop {

    public static void main( String[] args ) {

        Bateau2 bateauRunnable = new Bateau2();
        Thread thread = new Thread( bateauRunnable );
        ;
        bateauRunnable.setName( "Nicolas" );
        bateauRunnable.setRapiditeTraitementEnMiliSecondes( 2000 );

        thread.start();

        bateauRunnable.setStopThread( true );

        Bateau2 bateauRunnable2 = new Bateau2();
        Thread thread2 = new Thread( bateauRunnable2 );
        ;
        bateauRunnable2.setName( "Valentine" );
        bateauRunnable2.setRapiditeTraitementEnMiliSecondes( 2000 );

        thread2.start();

    }

}
