package Concurrence;

public class MainConcurrence {

    public static void main( String[] args ) {
        // A. On a qu'une seule chaudi�re

        Chaudiere chaudiere = new Chaudiere();

        // B. on cr�� une classe anonyme habitant qui impl�mente Runnable
        Runnable habitant = new Runnable() {
            public void run() {
                System.out.println( "Lancement thread " + Thread.currentThread().getId() );
                // chaque habitant a son thermostat qui prend en param�tre
                // l'uniquemetn chaudiere
                Thermostat thermostat = new Thermostat( chaudiere );
                // chaque habitant peut augmenter 5 fois la temperature de la
                // chaudiere via son propre thermostat
                int possibiliteDAugmenterLaTemperature = 0;
                do {
                    thermostat.plusChaud();
                    possibiliteDAugmenterLaTemperature++;
                }

                while ( possibiliteDAugmenterLaTemperature <= 5 );

            }

        };

        // C on cr�� un tablea de 20 thread d'habitants qui prennent en param
        // chacun un habitant (impl�mtant lui m�me l'interface Runnable

        Thread[] habitants = new Thread[20];

        for ( int i = 0; i < habitants.length; i++ ) {
            habitants[i] = new Thread( habitant );
        }

        // On d�marre les thread pour chacun des habitant

        for ( int i = 0; i < habitants.length; i++ ) {
            habitants[i].start();
        }

        // on laisse chaque thread habitant se terminer avant de reprendre le
        // main
        for ( int i = 0; i < habitants.length; i++ ) {
            try {
                habitants[i].join();
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            ;
        }

        System.out.println( chaudiere.getTemperature() );

    }

}
