package Assignment_4;

public class JumpStatementExample {
    public static void main(String[] args) {

        System.out.println("break statement example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("------------------------");

        System.out.println("continue statement example:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Skipping at j = " + j);
                continue;
            }
            System.out.println("j = " + j);
        }
    }
}
