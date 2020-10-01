package Concurrence;

public class MainCompteur {

    public static void main( String[] args ) {
        // TODO Auto-generated method stub
        Compteur compteur = new Compteur();

        Thread thread1 = new Thread( compteur );
        thread1.setName( "compteur 1" );
        thread1.start();
        Thread thread2 = new Thread( compteur );
        thread2.setName( "compteur 2" );
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println( Compteur.nombre );

    }

}
