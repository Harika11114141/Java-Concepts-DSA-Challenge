public class odd_num {
    public static void main(String[] args)
    {
        // int i = 200;
        // while(i >= 25)
        // {
        //     if(i % 2 != 0)
        //     {
        //         System.out.println(i);
        //         //i--;
        //     }
        //     i--;
        // }
        int i = 200;
        do
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
            i--;
        }while(i >= 25);
    }
}
