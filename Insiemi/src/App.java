import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Personcina> elements = new ArrayList<>();

        Timido t = new Timido();
        Maranza m = new Maranza();

        elements.add(t);
        elements.add(m);

        for( Personcina p : elements ) {
            p.offenditi();
        }
 

    }
}
