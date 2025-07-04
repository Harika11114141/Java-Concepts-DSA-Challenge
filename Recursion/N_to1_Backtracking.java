package Recursion;

import java.util.Scanner;

public class N_to1_Backtracking {
    void f(int i, int N)
    {
        if(i > N)
        {
            return;
        }
        f(i+1,N);
        System.out.println(i);
    }
    public static void main(String[] args) {
        N_to1_Backtracking bt = new N_to1_Backtracking();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n val: ");
        int N = sc.nextInt();
        bt.f(1,N);
    }
}
