import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int fact = 1;
        // int i = 1;
        // while(i <= number)
        // {
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.println(fact);
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact *= i;

        }
        System.out.println(fact);
        sc.close();
    }
}
