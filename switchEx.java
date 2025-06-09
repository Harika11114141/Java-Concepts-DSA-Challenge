
import java.util.Scanner;

public class switchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
            System.out.println("omg monday");
                break;
            case 2:
            System.out.println("oops tuesday");
            break;
            case 3:
            System.out.println("yeah today wednesday");
            break;
            case 4:
            System.out.println("hmm thursday");
            break;
            case 5:
            System.out.println("hoola friday");
            break;
            case 6:
            System.out.println("oh weekend saturday");
            break;
            case 7:
            System.out.println("fun day sunday");
            break;
            default:
                throw new AssertionError();
        }
        sc.close();
    }
}
