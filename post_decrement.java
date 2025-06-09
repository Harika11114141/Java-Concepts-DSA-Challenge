public class post_decrement
{
    public static void main(String[] args) {
        int a = 9;
        int b = 8;

        System.out.println("a-- = " +(a--));
        System.out.println("b-- = " +(b--));
        System.out.println("a-- + b-- = " + (a-- + b--));
        System.out.println("b-- - a-- = " + (b-- - a--));
        System.out.println("a-- + a-- = " + (a-- + a--));
    }
}