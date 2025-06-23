public class print_even_number_btw_200_to_500_using_while {
    public static void main(String[] args) {
        int i = 200;
        while(i <= 500)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }    
            i++;
        }
    }
}
