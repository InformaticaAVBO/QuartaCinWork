
import java.util.Iterator;

public class MyArray<T> {

    int size, delta, top;
    T[] data;

    @SuppressWarnings("unchecked")
    public MyArray( int size, int delta ) {
        this.size = size;
        this.delta = delta;
        data = (T[]) new Object[size];
        top = 0;
    }

    public void add( T value ) {
        // completare il metodo add, che aggiunge un elemento alla fine dell'array, e se necessario allarga l'array di delta elementi
    }

    public String toString() {
        // completare il metodo toString, che restituisce una stringa con tutti gli elementi dell'array su righe separate
        return "Il contenuto di MyArray è: \n" + super.toString();
    }

    public boolean contains( T value ) {
        // completare il metodo contains, che restituisce true se l'array contiene value, false altrimenti
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<top;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };
    }

}
