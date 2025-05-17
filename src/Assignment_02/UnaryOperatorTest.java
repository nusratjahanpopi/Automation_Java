package Assignment_02;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        System.out.println("Increment Operator:");
        System.out.println("num1++: " + num1++); // Postfix increment num1 = 10+1 = 11
        System.out.println("++num2: " + ++num2); // Prefix increment num2 = 20+1 = 21


        System.out.println("Decrement Operator:");
        System.out.println("num1--: " + num1--); // Postfix decrement num1 = 11-1 = 10
        System.out.println("--num2: " + --num2); // Prefix decrement num2 = 21-1 = 20

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        ;
    }

}
