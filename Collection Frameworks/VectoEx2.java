
import java.util.Arrays;
import java.util.Vector;

public class VectoEx2 {
    public static void main(String[] args) {
        Integer []array = {1,2,3,4,5,6,7};
        // Converts an array to a fixed-size List.(asList)
        // Convert array → List
        Vector<Integer> v1 = new Vector<>(Arrays.asList(array));
        System.out.println(v1);
        // Converts an array to a printable String representation.(toString)
        // Convert array → String text
        System.out.println(Arrays.toString(array));  // [1, 2, 3, 4, 5, 6, 7]

        System.out.println(v1.size()); // 7
        System.out.println(v1.capacity()); // 7
        System.out.println(array.length); // 7

    }
}
