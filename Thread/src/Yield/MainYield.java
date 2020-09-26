package Yield;

public class MainYield {

    public static void main( String[] args ) {

        Parler mechant = new Parler();
        Parler gentil = new Parler();

        mechant.setMot( "batard" );
        gentil.setMot( "cool" );

        Thread threadMechant = new Thread( mechant );
        Thread threadGentil = new Thread( gentil );
        threadMechant.start();
        threadGentil.start();

    }

}
