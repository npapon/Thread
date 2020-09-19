import bean.BateauRunnable;

public class MainRunnableAvecStop {

    public static void main( String[] args ) {

        BateauRunnable bateauRunnable = new BateauRunnable();
        Thread thread = new Thread( bateauRunnable );
        ;
        bateauRunnable.setName( "Nicolas" );
        bateauRunnable.setRapiditeTraitementEnMiliSecondes( 2000 );

        thread.start();

        bateauRunnable.setStopThread( true );

        BateauRunnable bateauRunnable2 = new BateauRunnable();
        Thread thread2 = new Thread( bateauRunnable2 );
        ;
        bateauRunnable2.setName( "Valentine" );
        bateauRunnable2.setRapiditeTraitementEnMiliSecondes( 2000 );

        thread2.start();

    }

}
