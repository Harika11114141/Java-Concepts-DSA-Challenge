
import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = n; i >= 1; i--)
        // {
        //     System.out.println(i);
        // }
        int i = n;
        while(i >= 1)
        {
            System.out.println(i);
            i--;
        }
    }
}
