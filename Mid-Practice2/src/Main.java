public class Main {
    public static void main(String[] argv) {
        ISearch searchMethod = new LinearSearch();
        intArray arr = new intArray();

        boolean res = searchMethod.search(arr, 30);
        System.out.println(res);
    }
}
