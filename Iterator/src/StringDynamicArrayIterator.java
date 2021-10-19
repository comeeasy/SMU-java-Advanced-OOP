import java.util.Iterator;

public class StringDynamicArrayIterator implements Iterator {
    private StringDynamicArray arr;
    private int count;

    public StringDynamicArrayIterator(StringDynamicArray arr) {
        this.arr = arr;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        if (count < arr.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        return arr.get(count++);
    }

}
