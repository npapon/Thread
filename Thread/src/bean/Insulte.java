package bean;

public class Insulte {

    private String insulte;

    public void insulter( String insulte ) {

        try {
            Thread.sleep( 2000 );
        } catch ( InterruptedException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for ( int i = 0, j = 20; i < j; i++ ) {

            System.out.println( "Gros " + insulte );
        }

    }
}
