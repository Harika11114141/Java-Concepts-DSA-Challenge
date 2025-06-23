
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 1)
        {
            System.out.println("it is not a prime number");
        }
        else
        {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n) ; i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(n+ " it is a prime number");
            }
            else {
                System.out.println(n+ " not a prime number");
            }
        }
        scan.close();
    }
}
