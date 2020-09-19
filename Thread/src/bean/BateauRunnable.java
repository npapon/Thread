package bean;

public class BateauRunnable implements Runnable {

    private String  name;
    private boolean stopThread = false;
    private int     rapiditeTraitementEnMiliSecondes;

    public void run() {

        while ( !stopThread ) {
            naviguer( this.name, this.rapiditeTraitementEnMiliSecondes );
        }
        System.out.println( name + " a arrete de naviguer" );
    }

    public void naviguer( String name, int rapiditeTraitementEnMiliSecondes ) {

        int i = 0;
        while ( i++ < 20 ) {
            System.out.println( name + " vogue " + i + " vague(s)" );

            try {
                Thread.sleep( rapiditeTraitementEnMiliSecondes );
            } catch ( InterruptedException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getRapiditeTraitementEnMiliSecondes() {
        return rapiditeTraitementEnMiliSecondes;
    }

    public void setRapiditeTraitementEnMiliSecondes( int rapiditeTraitementEnMiliSecondes ) {
        this.rapiditeTraitementEnMiliSecondes = rapiditeTraitementEnMiliSecondes;
    }

    public boolean isStopThread() {
        return stopThread;
    }

    public void setStopThread( boolean stopThread ) {
        this.stopThread = stopThread;
    }

}