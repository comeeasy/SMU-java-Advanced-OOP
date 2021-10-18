
public class LinearSearch implements ISearch{
    @Override
    public boolean search(intArray arr, int num) {
        for(int i=0; i<arr.length(); ++i) {
            if (arr.get(i) == num) return true;
        }
        return false;
    }
}
