
import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a %2 == 0)
        {
            System.out.println((a)+ " is even");

        }
        else if (a%2 != 0)
        {
            System.out.println((a)+ " is odd");
        }
        else
        {
            System.out.println("not even");
        }
        sc.close();
    }
}
