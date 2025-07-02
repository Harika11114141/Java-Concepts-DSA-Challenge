
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityqueueEx2 {
    public static void main(String[] args) throws InterruptedException{
        Queue<String> rooms = new PriorityQueue<>();
        PriorityBlockingQueue<Integer> floor = new PriorityBlockingQueue<>();
        rooms.offer("3BHK");
        rooms.add("2BHK");
        rooms.add("1BHK");
        rooms.add("2BHK");
        // System.out.println(rooms);
        // rooms.add(null); // not allowed exception
        System.out.println(rooms);
        // floor.offer(2);
        // floor.add(4);
        // floor.add(3);
        //floor.add(2);
        Integer v = floor.take();
        System.out.println(v);
        // floor.add(null);
        // System.out.println(floor); // exception
    }
}
