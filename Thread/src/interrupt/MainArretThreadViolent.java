package interrupt;

public class MainArretThreadViolent {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub

        System.out.println( "Lancement du thread principal :" + Thread.currentThread().getName() );

        Combo combo = new Combo();
        combo.setNombreCombo( 10 );
        combo.setRapiditeCombo( 1000 );
        Thread comboThread = new Thread( combo );

        comboThread.start();

        Combo combo2 = new Combo();
        combo2.setNombreCombo( 10 );
        combo2.setRapiditeCombo( 1000 );
        Thread comboThread2 = new Thread( combo2 );

        comboThread2.start();

        System.out.println( comboThread.isInterrupted() + " - " + comboThread.isInterrupted() );

        // On attend un peu avant d'interrompre
        try {
            Thread.sleep( 3000 );
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        comboThread.interrupt();

        System.out.println( comboThread.isInterrupted() + " - " + comboThread.isInterrupted() );
    }

}
