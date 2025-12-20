public class App {
	public static void main(String[] args) {

        // crea una lista di stringhe con dati di prova, la manipola con i metodi presenti ed infine la stampa
        Lista l = new Lista();
	    l.add( "Mario" );
	    l.addHead(new Nodo("Prima di Mario"));
	    l.addTail(new Nodo("Dopo di Mario"));
        
		System.out.println("Lunghezza lista: " + l.getLength());
		System.out.println("Contiene 'Mario'? " + l.exists("Mario"));
		System.out.println("Contiene 'Luigi'? " + l.exists("Luigi"));
		System.out.println(l);
		System.out.println("Rimuovo 'Mario': " + l.remove("Mario"));
		System.out.println(l);
	}
}