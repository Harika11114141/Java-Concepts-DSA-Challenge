
import java.util.Scanner;

public class prime_r_composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number <= 1)
        {
            System.out.println("number is either prime nor composite");
        }
        else
        {
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(number); i++)
            {
                if(number % i == 0)
                {
                    isPrime=false;
                    break;
                }  
            }
            if(isPrime)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("composite");
            }
        }

    }
}
