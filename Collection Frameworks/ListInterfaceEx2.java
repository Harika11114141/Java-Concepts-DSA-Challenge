
import java.util.*;

public class ListInterfaceEx2 {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        // add the elements
        movies.add("Seetha ramam");
        movies.add("Zebra");
        movies.add("manu");
        movies.add("Anaganaga");

        System.out.println(movies);
        
        // for(String Final : movies)
        // {
        //     System.out.println("list the movie : " + Final);
        // }

        // update the elements
        movies.set(2,"Oyy");
        System.out.println(movies);
        System.out.println(movies.contains("Oyy"));

        // seraching a movie name
        int result = movies.indexOf("Oyy");
        System.out.println(result);

        // remove the movie name
        movies.remove(1);
        System.out.println(movies);

        // accessing elements
        String j = movies.get(0);
        System.out.println(j);

        // the movie name is present or not will chesk using the contains operation

        System.out.println(movies.contains("oyy")); // false , becoz Oyy is there not oyy

    }
}
