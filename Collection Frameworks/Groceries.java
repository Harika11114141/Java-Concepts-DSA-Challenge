import java.util.*;

public class Groceries {
    public static void main(String[] args) {
        Vector<String> groceries = new Vector<>();
        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("coconut");
        groceries.add("besan flour");
        groceries.add("curd");

        groceries.add("Eggs");
        groceries.add("coconut");
        groceries.add("besan flour");
        groceries.add("curd");

        groceries.add("Eggs");
        groceries.add("coconut");
        groceries.add("besan flour");
        groceries.add("curd");

        System.out.println(groceries);

        Vector<String> rates = new Vector<>();
        rates.add("35.00");
        rates.add("150.00");
        rates.add("55.00");
        rates.add("60.00");
        rates.add("30.00");

        System.out.println(rates);

        // i want to add all the values
        rates.addAll(3,groceries);
        System.out.println(rates);

        // remove the values
        groceries.remove(3);
        System.out.println(groceries);
        rates.remove(2);
        System.out.println(rates);

        groceries.remove("Eggs");
        System.out.println(groceries);

        rates.removeAll(groceries);
        System.out.println(rates);

        // groceries.clear();
        // System.out.println(groceries);

        // retrival the elements
        System.out.println(groceries.get(2));

        // update a value
        groceries.set(2, "bread");
        groceries.set(1, "rice");
        System.out.println(groceries);

        // verify
        groceries.addAll(3,rates);
        groceries.set(9, "paste");
        System.out.println(groceries.contains("Milk"));
        System.out.println(groceries.containsAll(rates));
        System.out.println(groceries);

        System.out.println(groceries.size());
        System.out.println(groceries.firstElement());
        System.out.println(groceries.capacity());
        System.out.println(rates.size());
        System.out.println(rates.capacity());

        System.out.println(groceries.indexOf("Eggs"));
        System.out.println(groceries.lastIndexOf("Eggs"));
    }
}


// [Milk, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd]
// [35.00, 150.00, 55.00, 60.00, 30.00]
// [35.00, 150.00, 55.00, Milk, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd, 60.00, 30.00]
// [Milk, Eggs, coconut, curd, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd]
// [35.00, 150.00, Milk, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd, 60.00, 30.00]
// [Milk, coconut, curd, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd]
// [35.00, 150.00, 60.00, 30.00]
// curd
// [Milk, rice, bread, Eggs, coconut, besan flour, curd, Eggs, coconut, besan flour, curd]
// true
// true
// [Milk, rice, bread, 35.00, 150.00, 60.00, 30.00, Eggs, coconut, paste, curd, Eggs, coconut, besan flour, curd]
// 15
// Milk
// 20
// 4
// 20
// 7
// 11