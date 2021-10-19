import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StringDynamicArray arrs = new StringDynamicArray();
        IntDynamicArray arr = new IntDynamicArray();
//        ArrayList arr = new ArrayList();

        arrs.add("우");
        arrs.add("리");
        arrs.add("애");
        arrs.add("기");
        arrs.add("곤");
        arrs.add("쥬");
        arrs.add("제");
        arrs.add("일");
        arrs.add("예");
        arrs.add("뻐");
        arrs.add("우");
        arrs.add("리");
        arrs.add("애");
        arrs.add("기");
        arrs.add("곤");
        arrs.add("쥬");
        arrs.add("제");
        arrs.add("일");
        arrs.add("예");
        arrs.add("뻐");

        for (int i = 0; i < 15; i++) {
            arr.add(i);
        }

        for (int i=0; i<arrs.size(); ++i) {
            System.out.println(arrs.get((i)));
        }

        for (Iterator itr=arrs.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }

//        System.out.println("for문과 get() 사용");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }

        System.out.println("for문과 iterator 사용");
        for (Iterator itr = arr.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next());
        }

        System.out.println("for-each구문 사용");
        for (Object n : arr) {
            System.out.println((Integer) n);
        }
    }

}
