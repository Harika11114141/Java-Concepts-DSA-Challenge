
import java.util.*;
import java.util.Map.Entry;

public class MapInterfaceEx {
    public static void main(String[] args) {
        // create a map 
        Map<String, Float> mobileData = new Hashtable<>();

        // add the elements
        mobileData.put("Iphone 15", 79000.00f);
        mobileData.put("Samsung galaxy", 65999.00f);
        mobileData.put("OnePlus 12", 57999.00f);
        mobileData.put("Redmi note 13", 17999.00f);

        System.out.println(mobileData);

        // retrieval of keys - accessing using keys 
        System.out.println("accessing keys using keyset: ");
        Set<String> accessKeys = mobileData.keySet(); 
        for (String s : accessKeys) {
            System.out.println(s);
        }
        // this way is not working 
        // for(int i = 0; i < mobileData.size(); i++)
        // {
        //     System.out.println(mobileData.keySet());
        // }

        // retrieval of values
        System.out.println("accessing values using 'values': ");
        Collection<Float> accessValues =  mobileData.values();
        for (Float integer : accessValues) {
            System.out.println(integer);
        }
        System.out.println("----------------");

        // another way of retrieval value based on key
        System.out.println(mobileData.get("Redmi note 13"));

        // Loop through all keys and print each key-value pair from the map
        for (String s1 : accessKeys) {
            System.out.println(s1 + " : " + mobileData.get(s1));
        }

        // alternate way of printing keys and values
        System.out.println("-------------------------------------------");
        Set<Entry<String, Float>> keyValuesBoth = mobileData.entrySet();
        for (Entry<String,Float> entry : keyValuesBoth) {
            String mobileName = entry.getKey();
            Float price = entry.getValue();
            System.out.println(mobileName + "--" + price);

        }
        

        // delete the elements
        // multiple ways to remove the elements 
        mobileData.remove("Samsung galaxy");
        System.out.println(mobileData);
        mobileData.remove("Iphone 15", 79000.00f);
        System.out.println(mobileData);

        // now verify the keys
        System.out.println(mobileData.containsKey("Redmi note 13"));
        // verify the values
        System.out.println(mobileData.containsValue(57999.00f));
        System.out.println(mobileData.containsKey("edhjedsjkhefj"));

        // update the elements
        mobileData.put("Vivo V27 Pro",31999.50f);
        System.out.println(mobileData);
        // It adds a new key and value to a Map only if that key is not already there, To avoid overwriting old data by mistake.
        mobileData.putIfAbsent("Redmi note 13", 18000.00f);
        System.out.println(mobileData);

        mobileData.put("Redmi note 13", 20000.00f);
        System.out.println(mobileData);

        // size
        System.out.println(mobileData.size());
        // mobileData.clear();
        // System.out.println(mobileData);



    }
}
