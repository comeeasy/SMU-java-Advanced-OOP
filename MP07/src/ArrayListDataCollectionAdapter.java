import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDataCollectionAdapter<T> implements DataCollection<T>, Iterable<T> {
    private ArrayList<T> arr = null;

    public ArrayListDataCollectionAdapter(ArrayList<T> list) {
        this.arr = list;
    }

    @Override
    public boolean put(T s) {
        try {
            this.arr.add(s);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public T elemAt(int index) {
        return this.arr.get(index);
    }

    @Override
    public int length() {
        return this.arr.size();
    }

    @Override
    public Iterator<T> createIterator() {
        return this.arr.iterator();
    }

    @Override
    public Iterator<T> iterator() {
        return this.arr.iterator();
    }
}
