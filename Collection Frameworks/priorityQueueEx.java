
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Comparator.reverseOrder());
        numbers.offer(104);
        numbers.offer(108);
        numbers.offer(1206);
        numbers.add(0);
        numbers.offer(3333333);
        // /* add the the element use 'offer' or also using 'add'
        // PriorityQueue doesn't maintain sorted order for all elements, but the head always contains 
        // the highest priority element (which usually means the lowest value by default). */
        System.out.println(numbers);  // [0, 104, 1206, 108, 3333333]
        // /*
        // use the peek() method to access the head element. That means, in a PriorityQueue, 
        // we can only access the head element, not any random element directly . */
        System.out.println(numbers.peek()); // 0
        // /*
        // poll() also, it removes only the element with the highest priority — that is, 
        // the head element.Once the head is removed, the next highest priority element automatically becomes the new head. */
        System.out.println(numbers.poll()); // 0
        // /*
        // `remove()`  → throws `NoSuchElementException`
        // It tries to remove head,**but throws exception ,if queue is empty.`remove()` are strict methods** they expect at least one element, so they crash if queue is empty. */
        System.out.println(numbers.remove()); // here 104 but if queue is empty it will generate exception
        System.out.println(numbers.contains(108));
        // /* 
        // if i want to print it in not a lowet priority order i want highes priority so im using 
        // comparator.reverseOrder() */
        System.out.println(numbers); // [3333333, 1206, 108, 0, 104]
        /*
        for-each loop does not access elements in priority order.
        so im using while it help to arrange in priority order only poll will remove in head element only */
        while(!numbers.isEmpty())
        {
            System.out.println(numbers.poll());
        }

    }
}
