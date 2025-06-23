public class shiftOperatorEx {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("left shift: " + (a <<1));
        System.out.println("left shift 2 times: " +(a << 2));
        System.out.println("left shift 4 times: " + (a << 4));
        System.out.println("right shift: " +(a >> 1));
        System.out.println("right shift 2 times: " + (a >> 2));
        System.out.println("right shift 3 times: " + (a >> 3));
        System.out.println("unsigned right shift: " +(a >>>1));
        int n = -75;
        System.out.println("unsigned one: " +(n>>>2));
    }
}
