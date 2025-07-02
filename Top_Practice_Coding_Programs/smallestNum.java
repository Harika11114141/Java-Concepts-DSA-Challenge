
import java.util.Scanner;

public class smallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int smallest = a1;
        if (a2 < smallest)
        {
            smallest=a2;
        }
        if (a3 < smallest)
        {
            smallest=a3;
        }
        System.out.println("smallest number is : " + smallest);
        sc.close();
    }
}
