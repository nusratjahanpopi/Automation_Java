package Assignment_4;

public class LoopExample {

        public static void main(String[] args) {

            int i = 1;
            System.out.println("do-while loop:");
            do {
                System.out.println("Number: " + i);
                i++;
            } while (i <= 3);

            System.out.println("-----------------------");

            int j = 1;
            System.out.println("while loop:");
            while (j <= 3) {
                System.out.println("Number: " + j);
                j++;
            }

            System.out.println("-----------------------");

            System.out.println("for loop:");
            for (int k = 1; k <= 3; k++) {
                System.out.println("Number: " + k);
            }

            System.out.println("-----------------------");

            System.out.println("for-each loop:");
            String[] fruits = {"Apple", "Banana", "Orange"};
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
            }
        }
    }


