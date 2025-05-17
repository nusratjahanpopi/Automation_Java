package Assignment_02;

public class VariableTest {
    int age = 25;
    static String name = "Nusrat Jahan";

    public static void main(String[] args) {
        VariableTest variableTest = new VariableTest();
        variableTest.printSomeThings();
        variableTest.prinSomeThings();
    }

    public void printSomeThings() {
        double amount = 200.50;
        System.out.println("Amount1: " + amount);
        System.out.println("age: " + age);
        System.out.println("Name: " + name);
    }

    public void prinSomeThings() {
        double amount = 100.50;
        System.out.println("Amount2: " + amount);
        System.out.println("age: " + age);
        System.out.println("Name: " + name);
    }
}

