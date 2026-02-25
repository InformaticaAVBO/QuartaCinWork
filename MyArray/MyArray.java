
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

    @SuppressWarnings("unchecked")
    public void add( T value ) {
        if (top == size) {
            // se l'array è pieno, lo allargo di delta elementi
            size += delta;
            T[] newData = (T[]) new Object[size];
            System.arraycopy(data, 0, newData, 0, top);
            data = newData;
        }
        data[top++] = value;
    }

    public String toString() {
        // uso iterator per costruire la stringa che rappresenta il contenuto di MyArray
        StringBuilder sb = new StringBuilder();
        sb.append("Gli elementi presenti in MyArray sono:\n");
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append("\n");
        }
        return sb.toString();
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
