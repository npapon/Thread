package Concurrence;

public class Thermostat {

    private Chaudiere chaudiere;

    public Thermostat( Chaudiere chaudiere ) {
        this.chaudiere = chaudiere;
    }

    public boolean plusChaud() {
        if ( this.chaudiere.getTemperature() < 25 ) {
            // l'appel à cette méthode indique simplement à la machine Java
            // qu'elle doit interrompre momentanément l'exécution de ce thread,
            // et passer la main au thread suivant

            Thread.yield();
            this.chaudiere.augementeTemperature();

            return true;
        }
        return false;

    }

}
