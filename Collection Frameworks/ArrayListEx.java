// same as vector differ some changes 
// not synchronized
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(22);
        A.add(42);
        A.add(212);
        A.add(89);
        A.add(22);

        System.out.println(A);

        // Integer[] arr = new Integer[]{23,37,28,292,929};
        // ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(arr));
        // System.out.println(A1);
        // for(Integer ref: A1)
        // {
        //     System.out.println(ref);
        // }
        System.out.println(A);
        System.out.println(A.size());
        System.out.println(A.set(2, 678));
        System.out.println(A);
        A.remove(2);
        System.out.println(A);

        // externally will synchronized
        //Collections.synchronizedList(A);
        //System.out.println(A);
        // will advanced code in future


        // here how to sort a values in arraylist
        Collections.sort(A);
        System.out.println(A);


    }
}
