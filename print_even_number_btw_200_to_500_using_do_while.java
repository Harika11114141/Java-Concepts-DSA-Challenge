public class print_even_number_btw_200_to_500_using_do_while
{
    public static void main(String[] args) {
        int a = 200;
        do
        {
            if (a % 2== 0)
            {
                System.out.println(a);

            }
            a++;
        }while(a <= 500);
    }
}