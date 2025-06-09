public class bitwiseEx {
    public static void main(String[] args) {
        int a = 0b1010;
        int b = 0b1100;

        System.out.println("bitwIse NOT: " + (a &b));
        System.out.println("bitwise OR: " +(a | b));
        System.out.println("bitwise XOR: " +( a ^ b));
        System.out.println("bitwise complement: " +(~a));
        System.out.println("bitwise complement: " +(~b));
    }
}
