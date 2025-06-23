
import java.util.Scanner;

class Next_Palindrome
{
    public static boolean Reverse(int n)
    {
        int original = n;
        int rev = 0;
        while(n > 0)
        {
            int last_D = n % 10;
            rev = (rev * 10) + last_D;
            n /= 10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int next = n + 1;
        while (true) {
            if(Reverse(next))
            {
                System.out.println("NExt panlindrome of number is : " + next);
                break;
            } 
            next++;
            
        }
        
    }
}