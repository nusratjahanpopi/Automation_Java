package Assignment_4;

public class Calculator {
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    public String greetUser(String name) {
        return "Hello, " + name + "!";
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printSum(10, 20);

        int result = calculator.multiply(5, 4);
        System.out.println("Multiplication: " + result);

        double div = calculator.divide(10, 3);
        System.out.println("Division: " + div);

        String greet = calculator.greetUser("Nusrat");
        System.out.println(greet);

        boolean evenCheck = calculator.isEven(8);
        System.out.println("Is 8 even? " + evenCheck);
    }
}
