package Recursion;

import java.util.Scanner;

public class one_toN_Backtracking {
    void f(int i, int N)
    {
        if(i < 1)
        {
            return;
        }
        f(i-1,N);
        System.out.println(i);
    }
    public static void main(String[] args) {
        one_toN_Backtracking b = new one_toN_Backtracking();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N value: ");
        int N = sc.nextInt();
        b.f(N,N);
    }
}
