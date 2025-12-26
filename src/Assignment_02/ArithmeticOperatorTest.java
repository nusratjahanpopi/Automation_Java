package Assignment_02;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        int num1 = 10, num2 =20, num3;
        num3 = num1 + num2;
        System.out.println("Addition: " + num3);
        num2 = num3 - num2;
        System.out.println("Subtraction: " + num2);
        num3 = num1 * num2;
        System.out.println("Multiplication: " + num3);
        num1 = num3 / num2;
        System.out.println("Division: " + num1);
    }
}
