
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Before swapping a value is ");
        int a = sc.nextInt();
        System.out.println("Before swapping b value is ");
        int b = sc.nextInt();
        a = a + b;
        b =  a - b;
        a = a - b;
        System.out.println("after swapping a value is " + a);
        System.out.println("After swapping b value is " + b);


    }
}
