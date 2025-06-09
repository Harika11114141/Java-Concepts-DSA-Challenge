
import java.util.Scanner;

public class sum_of_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        //int total = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i == 0 || i < 0)
            {
                break;
            }
            sum = sum+i;
            System.out.println(sum);
        }
        //System.out.println(sum);
    }
}
