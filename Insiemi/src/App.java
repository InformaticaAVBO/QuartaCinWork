import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Coppia<Integer, String> c1 = new Coppia<>(0, "Povera Italia");
        Coppia<Double, Character> c2 = new Coppia<>(31.5, 'x');
        System.out.println(c1);
        System.out.println(c2);

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
