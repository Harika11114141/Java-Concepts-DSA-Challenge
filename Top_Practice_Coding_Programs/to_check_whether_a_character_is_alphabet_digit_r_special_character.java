
import java.util.Scanner;

public class to_check_whether_a_character_is_alphabet_digit_r_special_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 48 && num <= 57)
        {
            System.out.println("Digits");
        }
        else if ((num >= 97 && num <= 122) || (num >= 65 && num <= 90))
        {
            System.out.println("Alphabest");
        }
        else
        {
            System.out.println("Special Characters");
        }
        sc.close();
    }
}
