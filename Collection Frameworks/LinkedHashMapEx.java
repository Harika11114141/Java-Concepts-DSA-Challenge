import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lockers = new LinkedHashMap<>();
        lockers.put("Aa", 1);
        lockers.put("Bb", 3);
        lockers.put("Cc",2);
        System.out.println(lockers);
        lockers.remove("Aa");
        Set<Entry<String, Integer>> setData = lockers.entrySet();
        for (Entry<String, Integer> s : setData) {
            System.out.println(s.getKey()+":"+s.getValue());
        }
    }
}
