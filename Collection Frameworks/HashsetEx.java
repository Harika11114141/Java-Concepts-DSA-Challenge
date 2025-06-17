
import java.util.HashSet;

public class HashsetEx {
    public static void main(String[] args) {
        // hashset -> hash map -.array of nodes
        HashSet<Integer> n = new HashSet<>();
        n.add(3333);
        n.add(9999);
        n.add(3333);
        System.out.println(n);
        n.remove(3333); // not index , its object
        System.out.println(n);
        for (Integer integer : n) {
            System.out.println(integer);
        }
        System.out.println(n.contains(9999));
        System.out.println(n.hashCode());
        System.out.println(n.isEmpty());
        System.out.println(n.equals(n));
    }
}
