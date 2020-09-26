package priorité;

public class Compteur implements Runnable {

    private boolean threadActif = true;
    private int     compteur    = 0;

    @Override
    public void run() {
        while ( threadActif ) {
            compteur++;
            System.out.println( Thread.currentThread().getName() + " : " + compteur );

        }

    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur( int compteur ) {
        this.compteur = compteur;
    }

    public boolean isThreadActif() {
        return threadActif;
    }

    public void setThreadActif( boolean threadActif ) {
        this.threadActif = threadActif;
    }

}
