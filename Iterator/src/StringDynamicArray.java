import java.util.Iterator;

public class StringDynamicArray implements Iterable{
    final int INCREMENT_SIZE = 10;
    int count = 0;
    int size = 0;
    String[] arr;

    public StringDynamicArray() {
        arr = new String[INCREMENT_SIZE];
        size = INCREMENT_SIZE;
        count = 0;
    }

    public void add(String s) {
        if (count >= size) {
            String[] tmp = new String[size + INCREMENT_SIZE];
            for(int i=0; i<size; ++i) {
                tmp[i] = arr[i];
            }
            size += INCREMENT_SIZE;
            arr = tmp;
        }
        arr[count++] = s;
    }

    public String get(int idx) {
        if (idx < size) {
            return arr[idx];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new StringDynamicArrayIterator(this);
    }
}
