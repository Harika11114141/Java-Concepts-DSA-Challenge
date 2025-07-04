package Recursion;

import java.util.Scanner;
public class sumOfN_func {
    static int finalSum(int N)
    {
        if(N==0)
        {
            return 0;
        }
        return N + finalSum(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(finalSum(N));
    }
}
