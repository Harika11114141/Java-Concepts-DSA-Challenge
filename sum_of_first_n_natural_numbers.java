import java.util.Scanner;

public class sum_of_first_n_natural_numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // int count = 1;
        // while(count <= n)
        // {
        //     sum = sum + count;
        //     count += 1;
        // }
        // System.out.println(sum);


        for (int i = 1; i <= n; i++)
        {
            if(i % 2!=0)
            {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
