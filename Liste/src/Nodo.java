/*
** Nodo.java - Classe che rappresenta un nodo di una lista collegata.
** Ogni nodo contiene un valore di tipo String e un riferimento al nodo successivo.
*/

public class Nodo {
    
    private String value;
    private Nodo next;
    
    public Nodo( String v ) {
        value = v;
        next = null;
    }

    public void setNext( Nodo n ) { next = n; }    
    public Nodo getNext() { return next; }    
    public void setValue( String v ) { value = v; }  
    public String getValue() { return value; }  

    public String toString() {
        return value;
    }
    
}
