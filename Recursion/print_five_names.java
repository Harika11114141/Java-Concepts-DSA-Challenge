public class print_five_names
{
    static int count = 0;
    public static void names()
    {
        if(count == 5)
        {
            return;
        }
        System.out.println("HArika");
        count++;
        names();
    }
    public static void main(String[] args) {
        names();
    }
}