package Recursion;

import java.util.Scanner;

public class print_N_to1 {
    void func(int N, int i)
    {
        // base case
        if(i < 1)
        {
            return;
        }
        System.out.println(i);
        func(N, i-1);
    }
    public static void main(String[] args) {
        print_N_to1 p = new print_N_to1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        p.func(N, N);
    }
}
