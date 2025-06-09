public class TernaryEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 4;

        int res = ((a > b) ? ((a < c) ? a : c): ((b > c) ? b : a));
        System.out.println(res);
    }
}
