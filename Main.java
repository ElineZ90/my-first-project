public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("I am learning Java. ");
        System.out.println("It is okay.");
        // Let's do some math
        System.out.println(1 + 1);
        System.out.println(2 * 3);
        // Let's assign my first variable
        String name = "John";
        System.out.println(name);
        int myNum;
        myNum = 15;
        System.out.println(myNum);
        myNum = 20;
        System.out.println(myNum);
        System.out.println("Hello " + name);
        String firstName = "John ";
        String lastName = "Doe";
        String fullName =  firstName + lastName;
        System.out.println("The name is " + firstName + ", " + fullName);

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}