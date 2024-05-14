

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

        // Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Strings
        String greeting = "Hello world";
        System.out.println(greeting);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        // Strings continued
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The alphabet has a lot of letters: " + alphabet.length() + " in total");
        System.out.println(alphabet.toUpperCase());
        System.out.println(alphabet.indexOf("q"));
        System.out.println(greeting + " " + studentName);
        System.out.println(firstName.concat(lastName));

        /* For special symbols such as singe quotes, double quotes and backslash use a backslash before it to escape.
        Also the \n (new line) \r (return) \t (tab) \b (backspace) \f (form feed)  are used. */

        // Maths

        Math.max(5, 10);
        System.out.println(Math.min(10, 20));

        // Conditional testing
        /* if (condition1) {
        // block of code to be executed if condition1 is true
        } else if (condition2) {
         // block of code to be executed if the condition1 is false and condition2 is true
        } else {
        // block of code to be executed if the condition1 is false and condition2 is false
        }
        */ 

        int myAge = 32;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("I can vote");
        } else {
            System.out.println("Cannot yet vote");
        }

        // Ternary operator for if else with ? and : 
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Next up: Java Switch w3wchools.com/java/java_switch.asp











    }
}