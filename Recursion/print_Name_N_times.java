// Recursion concepts
package Recursion;

import java.util.Scanner;

public class print_Name_N_times {
    //int i;
    public static void Names(int i, int n)
    {
        if( i > n)
        {
            return;
        }
        System.out.println(i);
        Names(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Names(1, n);
    }
}
