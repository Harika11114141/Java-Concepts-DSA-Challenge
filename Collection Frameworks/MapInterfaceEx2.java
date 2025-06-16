import java.util.*;

public class MapInterfaceEx2 {
    public static void main(String[] args) {
        int arr[] = { 1,28,2,29,19,19,93,39,1,39, 29, 6, 3};
        ArrayList<Integer> AI = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            AI.add(arr[i]);
        }
        HashMap<Integer, Integer> HI = new HashMap<>();
        for(int i = 0; i < AI.size(); i++)
        {
            /*
             * We are using putIfAbsent(key, value) method here.
             *
             * Why? Because:
             * - If the key (element) is already present in the HashMap, we want to skip it.
             * - If the key is NOT present, we want to add it with its frequency count.
             *
             * Collections.frequency(collection, element) gives the number of times 
             * the element appears in the list.
             */
            HI.putIfAbsent(AI.get(i), Collections.frequency(AI, AI.get(i)));
        }
        System.out.println(HI); // {1=2, 2=1, 19=2, 3=1, 6=1, 39=2, 28=1, 29=2, 93=1}
    }
}



