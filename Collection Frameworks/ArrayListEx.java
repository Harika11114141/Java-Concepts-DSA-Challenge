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

        System.out.println(A); // [22, 42, 212, 89, 22]

        // Integer[] arr = new Integer[]{23,37,28,292,929};
        // ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(arr));
        // System.out.println(A1);
        // for(Integer ref: A1)
        // {
        //     System.out.println(ref);
        // }
        System.out.println(A); // [22, 42, 212, 89, 22]
        System.out.println(A.size()); // 5
        System.out.println(A.set(2, 678)); // 212
        System.out.println(A); // [22, 42, 678, 89, 22]
        A.remove(2);
        System.out.println(A); // [22, 42, 89, 22]

        // externally will synchronized
        //Collections.synchronizedList(A);
        //System.out.println(A);
        // will advanced code in future


        // here how to sort a values in arraylist
        Collections.sort(A);
        System.out.println(A); // [22, 22, 42, 89]

        ArrayList<String> cricketerNames = new ArrayList<>();
        cricketerNames.add("Sachin");
        cricketerNames.add("dhoni");
        cricketerNames.add("Sharma");
        cricketerNames.add("Virat");
        cricketerNames.add("Rahul");
        cricketerNames.add("Rohit sharma");
        cricketerNames.add("Kapil Dev");

        System.out.println(cricketerNames); // [Sachin, dhoni, Sharma, Virat, Rahul, Rohit sharma, Kapil Dev]
        // so i want to print in sorted order
        Collections.sort(cricketerNames);
        /*
         * [Kapil Dev, Rahul, Rohit sharma, Sachin, Sharma, Virat, dhoni]
         * "dhoni" comes last because it starts with lowercase 'd', and lowercase letters come after all uppercase letters in ASCII order.
         */
        System.out.println(cricketerNames); 

    }
}
