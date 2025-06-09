public class sum_of_even_num {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2== 0)
            {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);
    }
    
}
