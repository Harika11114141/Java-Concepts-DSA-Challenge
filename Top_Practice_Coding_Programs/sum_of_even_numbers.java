public class sum_of_even_numbers {
    public static void main(String[] args) {
        int start = 40;
        //int temp = start;
        int sum = 0;
        while(start <= 80)
        {
            if(start % 2 == 0)
            {
                sum = sum + start;
            }
            start++;
        }
        System.out.println(sum);
    }
}
