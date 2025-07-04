package Recursion;
// functional type sum of N numbers example
import java.util.Scanner;

public class sum_of_N {
    void sumOfNumbers(int i, int sum)
    {
        if(i < 1)
        {
            System.out.println(sum);
            return;
        }
        sumOfNumbers(i-1, sum+i);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sum_of_N s = new sum_of_N();
        s.sumOfNumbers(N, 0);

    }
}
