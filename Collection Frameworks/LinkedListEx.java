import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        /*
         * possible ways
         * LinkedList<type> varName = new LinkedList<>(); 
         * List<type> varName = new LinkedList<>(); - because linkedlist class implements list interface
         * Queue<type> varName = new LinkedList<>(); - Linkedlist class implements deque interface, this is extends the queue interface (so all the features and properties add in deque also)
         * Deque<type> varName = new LinkedList<>(); - Linkedlist class implements deque interface
         * Collection<type> varName = new LinkedList<>(); - collection is parent interface of list so
         * Iterable<type> varName = new LinkedList<>(); - Iterable is root interface for all
         * 
         * so I'm using list here 
         * There is no default capacity or size in LinkedList.
         * That’s because:
         * LinkedList is not array-based like ArrayList.
         * It uses Nodes (each node stores data, prev, and next).
         * So it grows dynamically as you add elements—no need to define initial capacity.
         */
        LinkedList<String> Names = new LinkedList<>();
        ArrayList<String> hobby = new ArrayList<>();
        Names.add("Saara");
        Names.add("Harika");
        Names.add("Sarika");
        System.out.println(Names);

        hobby.add("painting");
        hobby.add("craft");
        hobby.add(null);
        hobby.add("cleaning");
        System.out.println(hobby);
        
        System.out.println(Names.size()); 

        // update
        // Names.set(2,"Vallabha");
        // System.out.println(Names);
        
        // Names.addFirst("Bala");
        // System.out.println(Names); 

        // Names.addLast("Bittu");
        // System.out.println(Names); 

        // Names.add(1, "seetha");
        // System.out.println(Names); 

        Names.addAll(0,hobby);
        System.out.println(Names);

        System.out.println(Names.contains("cleaning"));
        System.out.println(Names.containsAll(hobby));
        System.out.println(Names.getFirst());
        System.out.println(Names.getLast());
        System.out.println(Names.removeFirst());
        System.out.println(Names.removeLast());
        System.out.println(Names.reversed()); 
        // collection.reverse(Names);
        System.out.println(hobby.indexOf(null));

        Object[] arr = Names.toArray();
        for(Object s : arr)
        {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        for(int i = 0; i < Names.size(); i++)
        {
            System.out.print(Names.get(i)+ " , ");
        }
        
    }
}
