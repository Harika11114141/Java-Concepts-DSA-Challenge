
import java.util.Scanner;

public class LargestnumberEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int largest_num = n1;
        if (n2 > largest_num)
        {
            largest_num = n2;
            //System.out.println(""+ largest_num);
        }
        if (n3 > largest_num)
        {
            largest_num = n3;
            //System.out.println(""+ largest_num);
        }
        
            System.out.println(""+largest_num);
        
        sc.close();
    }
}
