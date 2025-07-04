package Recursion;

import java.util.Scanner;

public class factorial {
    static int finalFactorial(int N)
    {
        if(N==0)
        {
            return 1;
        }
        return N * finalFactorial(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(finalFactorial(N));
    }
}
