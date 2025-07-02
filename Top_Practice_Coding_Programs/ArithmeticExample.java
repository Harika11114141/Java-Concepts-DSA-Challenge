public class ArithmeticExample {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        String num3 = "300";
        String num4 = "400";

        int a1 = Integer.parseInt(num3);
        int a2 = Integer.parseInt(num4);

        System.out.println("number 1: " + number1);
        System.out.println("number 2 is : " + number2);
        System.out.println("add number 1 and number 2: " + (number1 + number2));
        System.out.println("subtract the 2 numbers: " +(number1 - number2));
        System.out.println("multiply the numbers: " + (number1*number2));
        System.out.println("divide the numbers : " +(number1/number2));
        System.out.println("modulus the numbers: "+(number1%number2));

        System.out.println("add that string to integer converted numebers: " +(a1+a2));


    }
}
