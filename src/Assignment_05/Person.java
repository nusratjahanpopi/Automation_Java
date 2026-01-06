public class Person {


        String name;
        int age;

        // Default constructor
        Person() {
            name = "Unknown";
            age = 0;
        }

        // Overloaded constructor
        Person(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Person obj = new Person();
            Person obj1 = new Person("Nusrat", 22);

            obj.display();
            obj1.display();
        }


    }
