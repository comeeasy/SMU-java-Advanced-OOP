import java.util.ArrayList;

public class intArray {
    private ArrayList<Integer> arr;

    public intArray() {
        arr = new ArrayList<Integer>();
        for(int i=0; i<50; ++i) {
            arr.add((int)(Math.random() * 100 + 11));
        }
    }

    public int get(int index) {
        return arr.get(index);
    }

    public int length() {
        return arr.size();
    }

}
