import java.util.Iterator;

public class MyArrayList<T> {

    int size, delta;
    T[] data;

    @SuppressWarnings("unchecked")
    public MyArrayList( int size, int delta ) {
        this.size = size;
        this.delta = delta;
        data = (T[]) new Object[size];
    }

    public void add( T value ) {

    }

    public String toString() {
        return "";
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };
    }


}
