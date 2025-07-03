package Recursion;

import java.util.Scanner;

public class example1 {
    public void func(int i, int n)
    {
        if( i > n)
        {
            return;
        }
        System.out.println(i);
        func(i+1, n);
    }
    public static void main(String[] args) {
        example1 e = new example1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        e.func(1, n);
    }
}
