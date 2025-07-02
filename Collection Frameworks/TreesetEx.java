
import java.util.TreeSet;

public class TreesetEx {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("Apple");
        t.add("Rose");
        t.add("Dog");
        t.add("123");
        t.add("Doll");
        t.add("Ball");
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.ceiling("Rose"));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.comparator());
        System.out.println(t.descendingSet());
        System.out.println(t.headSet("Doll"));
        // System.out.println(t.subSet("Rose", "123"));

    }
}
