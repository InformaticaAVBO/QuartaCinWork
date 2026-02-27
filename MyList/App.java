import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {

        // crea una lista di stringhe con dati di prova, la manipola con i metodi presenti ed infine la stampa
        ListaOrdinata<String> l = new ListaOrdinata<>();
	    l.add( "Mario" );
	    l.add( "Luigi" );
	    l.add( "Anna" );
	    l.add( "Vincenzo" );
	    l.add( "Giuseppe" );
	    l.add( "Massimo" );
	    l.add( "Valerio" );
		System.out.println(l);

        // crea una lista di stringhe con dati di prova, la manipola con i metodi presenti ed infine la stampa
        ListaOrdinata<Bici> lb = new ListaOrdinata<>();
	    lb.add( new Bici(16, Colori.BIANCO ) );
	    lb.add( new Bici(24, Colori.ROSSO ) );
	    lb.add( new Bici(18, Colori.VERDE ) );
		System.out.println(lb);

		ArrayList<Bici> alb = new ArrayList<>();
		alb.add( new Bici(32, Colori.VERDE) );
		alb.add( new Bici(36, Colori.ROSSO) );
		alb.add( new Bici(22, Colori.BIANCO) );
		alb.add( new Bici(24, Colori.VERDE) );
		alb.add( new Bici(16, Colori.BIANCO) );
		System.out.println(alb);
		Collections.sort(alb);
		System.out.println(alb);

	}
}