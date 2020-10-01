package Concurrence;

public class Compteur implements Runnable {

    public static int nombre;

    public void run() {
        incrementer();
        System.out.println( Thread.currentThread().getName() + " fini" );

    }

    public synchronized void incrementer() {
        for ( int i = 0; i < 10000; i++ ) {
            nombre = nombre + 1;
        }
    }

}
