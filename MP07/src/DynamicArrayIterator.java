import java.util.Iterator;

public class DynamicArrayIterator<T> implements Iterator<T> {
    private DynamicArray<T> array = null;
    private int index;

    public DynamicArrayIterator(DynamicArray arr) {
        array = arr;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < array.length());
    }

    @Override
    public T next() {
        T obj = (T) array.elemAt(index);
        index++;
        return obj;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
