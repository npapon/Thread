
public class MyThread implements Runnable {

    private String  name;
    private boolean exit = false;
    private int     rapiditeTraitementEnMiliSecondes;

    public void run() {

        while ( !exit ) {

            naviguer( this.name, this.rapiditeTraitementEnMiliSecondes );
        }
        System.out.println( name + " Stopped." );
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

    public boolean isExit() {
        return exit;
    }

    public void setExit( boolean exit ) {
        this.exit = exit;
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

}
