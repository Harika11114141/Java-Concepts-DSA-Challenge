
import java.util.ArrayDeque;

public class arrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> course = new ArrayDeque<>();
        course.add("Java");
        course.addFirst("Python");
        course.poll();
        course.pollFirst();
        course.addLast("Go");
        course.peek();
        course.peekFirst();
        course.pollLast();
        course.peekLast();
        System.out.println(course); // []
        course.add("C++");
        while(!course.isEmpty())
        {
            System.out.println(course.poll()); // C++ ,C++
        }
    }
}
