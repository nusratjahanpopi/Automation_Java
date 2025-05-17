package Assignment_4;

public class DecisionMakingExample {

    public void checkPositive(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive.");
        }
    }

    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    public void gradeCheck(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
    }

    public void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Day: Sunday");
                break;
            case 2:
                System.out.println("Day: Monday");
                break;
            case 3:
                System.out.println("Day: Tuesday");
                break;
            case 4:
                System.out.println("Day: Wednesday");
                break;
            case 5:
                System.out.println("Day: Thursday");
                break;
            case 6:
                System.out.println("Day: Friday");
                break;
            case 7:
                System.out.println("Day: Saturday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }

    public static void main(String[] args) {

        DecisionMakingExample obj = new DecisionMakingExample();

        System.out.println("Simple if:");
        obj.checkPositive(5);

        System.out.println("if-else:");
        obj.checkEvenOdd(7);

        System.out.println("if-else-if ladder:");
        obj.gradeCheck(85);

        System.out.println("switch statement:");
        obj.dayOfWeek(6);
    }
}
