/*
** Lista.java - Classe che rappresenta una lista generica di nodi contenenti oggetti generici (di tipo T).
*/

public class Lista<T> {
    
    Nodo<T> root;
    
    public Lista() {
        root = null;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public int getLength() {
        Nodo<T> tmp = root;
        int l = 0;
        while (tmp!=null) {
            l++;
            tmp = tmp.getNext();
        }
        return l;
    }

    public void add( T t ) {
        Nodo<T> n = new Nodo<T>(t);
        addTail(n);
    }

    public void addHead( Nodo<T> n ) {
        Nodo<T> tmp = root;
        root = n;
        n.setNext(tmp);
    }

    public void addTail( Nodo<T> n ) {
        if (root==null) {
            root = n;
        } else {
            Nodo<T>  temp = root;
            while (temp.getNext()!=null) temp=temp.getNext();
            temp.setNext(n);
        }
    }

    public boolean remove( T s ) {
        if (root==null) return false;
        if (root.getValue().equals(s)) {
            root = root.getNext();
            return true;
        }
        Nodo<T> tmp=root, succ=root.getNext();
        while (succ!=null) {
            if (succ.getValue().equals(s)) {
                tmp.setNext(succ.getNext());
                return true;
            }
            tmp=succ;
            succ=succ.getNext();
        } 
        return false;
    }

    public boolean exists( T s ) {
        Nodo<T> tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public Nodo<T> find( T s ) {
        Nodo<T> tmp = root;
        while (tmp!=null) {
            if (tmp.getValue().equals(s)) return tmp;
            tmp = tmp.getNext();
        }
        return null;
    }

    public String toString() {
        String s = "La lista contiene: ";
        Nodo<T> temp = root;
        while (temp!=null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}
