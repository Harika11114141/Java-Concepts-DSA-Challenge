
import java.util.Scanner;

public class ageCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 18)
        {
            System.out.println("vote will eligible");
        }
        else{
            System.out.println("vote not eligible");
        }
    }
    
}
