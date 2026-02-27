

public class ListaOrdinata<T extends Comparable<T>> {

    Nodo<T> head;

    public ListaOrdinata() {
        head = null;
    }

    public void add( T v ) {
        Nodo<T> n = new Nodo<>(v);
        if (head==null) { head = n; return; }
        if (head.getValue().compareTo(v)>0) {
            // lo inserisco in testa
            n.setNext(head);
            head = n;
            return;
        }
        Nodo<T> temp = head;
        while (true) {
            if (temp.getNext()==null) {
                // lo inserisco in coda
                temp.setNext(n);
                return;
            }
            if (temp.getNext().getValue().compareTo(v)>0) {
                // lo inserisco tra temp e il successivo
                n.setNext(temp.getNext());
                temp.setNext(n);
                break;
            }
            temp = temp.getNext();
        }
    }    

    public String toString() {
        String s = "La lista contiene: ";
        Nodo<T> temp = head;
        while (temp!=null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }

}
