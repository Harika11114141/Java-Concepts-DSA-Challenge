import java.util.*;
import java.util.Map.Entry;
public class HashmapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Tomato", 5);
        hm.put("potato", 4);
        hm.put("lady's finger", 2);
        hm.put("cabbage", 1);
        hm.put("brinjal", 7);
        hm.put("carrot", 5);

        Set<Entry<String, Integer>> vegetablesData = hm.entrySet();
        for (Entry<String, Integer> s: vegetablesData) 
        {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
        
        System.out.println(hm.remove("Tomato")); // 5
        hm.remove("carrot", 5);
        System.out.println(hm);

        System.out.println(hm.get("potato")); // 4

        hm.putIfAbsent("Broccoil", 3);
        System.out.println(hm);

        Set<Entry<String, Integer>> hm2 = hm.entrySet();
        for (Entry<String,Integer> entry1 : hm2) {
            System.out.println(entry1.getKey()+ ":" + entry1.getValue());
        }

        hm.replace("brinjal", 3);
        System.out.println(hm);

        HashMap<String, Integer> hm1 = new HashMap<>(hm);
        System.out.println(hm1);
    }
}
