package Assignment_02;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3;
        num1 += num2; // num1 = num1 + num2
        System.out.println("Addition: " + num1);

        num1 -= num2; // num2 = num2 - num1
        System.out.println("Subtraction: " + num2);

        num1 *= num2; // num1 = num1 * num2
        System.out.println("Multiplication: " + num1);

        num1 /= num1; // num2 = num2 / num1
        System.out.println("Division: " + num1);
    }
}
