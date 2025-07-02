import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.add(1);
        q.addFirst(88);
        q.addLast(33);
        System.out.println(q);
        q.peek();
        q.peekFirst();
        q.offerFirst(22);
        q.removeFirst();
        System.out.println(q);
    }
}
