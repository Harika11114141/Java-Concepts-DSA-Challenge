import java.util.Vector;

public class VectorEx4 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        // add(E e)
        v.add("HArika");
        v.add(22);
        v.add("Sarika");
        v.add(45.7);
        v.add(null);
        v.add(777.9999);
        v.add(0);

        System.out.println(v); // [HArika, 22, Sarika, 45.7, null, 777.9999, 0]
        // for(Object o : v)
        // {
        //     System.out.println(o);
        // }

        // add(int index, E e)
        v.add(3,"Sakshi");
        System.out.println(v);  // [HArika, 22, Sarika, Sakshi, 45.7, null, 777.9999, 0]

        // addAll(Collection c)
        Vector<Object> v1 = new Vector<>();
        v1.add("Hello my name is harika");
        v.addAll(v1);
        System.out.println(v);  // [HArika, 22, Sarika, Sakshi, 45.7, null, 777.9999, 0, Hello my name is harika]
        v1.addAll(v);
        System.out.println(v1); // [Hello my name is harika, HArika, 22, Sarika, Sakshi, 45.7, null, 777.9999, 0, Hello my name is harika]


        // get(int index) -- retrival
        System.out.println(v.get(4)); // 45.7

        // set(int index, E e) - update
        v.set(5,"Maya");
        System.out.println(v); // [HArika, 22, Sarika, Sakshi, 45.7, Maya, 777.9999, 0, Hello my name is harika]

        // remove(int index)
        v.remove(2);
        System.out.println(v); // [HArika, 22, Sakshi, 45.7, Maya, 777.9999, 0, Hello my name is harika]

        v.remove("Maya");
        System.out.println(v); // [HArika, 22, Sakshi, 45.7, 777.9999, 0, Hello my name is harika]

        // removeAll(Collection c)
        // v.removeAll(v1);
        // System.out.println(v); // []

        // v1.clear();
        // System.out.println(v1); // []

        System.out.println(v.size()); // 7
        System.out.println(v.capacity()); // 10
    
        v.add("BAla");
        v.add("Pandu");
        v.add(88888888);
        v.add("OOPs");
        v.add("collections");
        System.out.println(v.size()); // 12
        System.out.println(v.capacity()); // 20


        System.out.println(v1.isEmpty()); // false


        // contains(Object o) - verify
        System.out.println(v1.contains("HArika")); // true
        System.out.println(v1.containsAll(v)); // false


        // indexOf(Object o)
        System.out.println(v.indexOf("Sakshi")); // 2

        // lastIndexOf(Object o)
        System.out.println(v); // [HArika, 22, Sakshi, 45.7, 777.9999, 0, Hello my name is harika, BAla, Pandu, 88888888, OOPs, collections]
        System.out.println(v.lastIndexOf("Hello my name is harika")); // 6
        System.out.println(v.lastElement()); // collections

        System.out.println(v1); // [Hello my name is harika, HArika, 22, Sarika, Sakshi, 45.7, null, 777.9999, 0, Hello my name is harika]
        System.out.println(v1.firstElement()); // Hello my name is harika
        System.out.println(v1.lastElement()); // Hello my name is harika

        // ensureCapacity(int minCapacity)
        v.ensureCapacity(40);
        System.out.println(v.capacity()); /// 40


        // trimToSize()
        v.trimToSize();
        System.out.println(v.size()); // 12
        System.out.println(v.capacity()); // 12

        // toArray
        Object []arr = v.toArray();
        // for(int i = 0; i < v.size(); i++)
        // {
        //     System.out.println(arr[i]);
        // }

        for(Object o: v)
        {
            System.out.println(o);
        }

        // clone - copy
        Vector<Object> vag = (Vector<Object>) v.clone();
        System.out.println(vag); // [HArika, 22, Sakshi, 45.7, 777.9999, 0, Hello my name is harika, BAla, Pandu, 88888888, OOPs, collections]

    }  
}
