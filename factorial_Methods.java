
import java.util.Scanner;

public class factorial_Methods {
    public static int Factorial(int n)
    {
        int fact = 1;
        for(int i = n; i >= 1; i--)
        {
            fact = fact * i;    
        }
        //System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //n!= n*(n-1)*(n-2)*(n-3)....*1
        //Factorial(n);
        System.out.println(Factorial(n));

    }
    
}
