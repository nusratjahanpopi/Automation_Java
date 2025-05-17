package Assignment_03;

public class Student {
    // Variables Fields
    String name ="Nusrat jahan";

    // Method
    public void programing(){
        System.out.println( name + " is Programing Java.");
    }

    //main method
    public static void main(String[] args) {

        // Create  object
        Student student = new Student();

        // Call Variable
        System.out.println("Student Name: " + student.name);

        // Call Method
        student.programing();



    }

}
