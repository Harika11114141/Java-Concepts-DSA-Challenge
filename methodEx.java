
import java.util.Scanner;

public class methodEx {
    //method have parameters and have return type
    // public static int  addNum(int a, int b)
    // {
    //     int sum = a + b;
    //     return sum;


    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the first number");
    //     int a = sc.nextInt();
    //     System.out.println("enter the second number");
    //     int b = sc.nextInt();
    //     int res = addNum(a, b);
    //     System.out.println("sum of 2 numbers: " + res);
        
    // }

    // method have parameters but not have return type
    public static void add(int a , int b)
    {
        int sum = a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a, b);
    }
}
