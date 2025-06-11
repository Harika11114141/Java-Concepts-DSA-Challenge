
import java.util.*;

public class stackClassEx {
    public static void main(String[] args) {
        Stack<String> n = new Stack<>();
        n.push("Monday");
        n.push("tuesday");
        n.push("Wednesday");
        n.push("Thursday");
        n.push("Friday");
        n.push("Saturday");
        n.push("Sunday");
        // for(String Ref: n)
        // {
        //     System.out.println(Ref);
        // }
        System.out.println(n);
        System.out.println(n.peek());
        System.out.println(n.search("Friday"));
        while (!n.isEmpty()) {
            System.out.println(n.pop());     // Pops all safely
        }
        System.out.println(n.isEmpty());
    }
}
