public class Num {

    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(300);
        System.out.println(30000);
        System.out.println(3 + 3);
        System.out.println(3 * 3);

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        var x = 5; // x is an int
        System.out.println(x);
        var myDouble = 9.98; // double
        var myChar = 'D'; // char
        var myBoolean = true; // boolean
        var myString = "Hello"; // String

        /*
         * int myNum = 5;
         * float myFloatNum = 5.99f;
         * char myLetter = 'D';
         * boolean myBool = true;
         * String myText = "Hello";
         */

        int x = 5;
        int y = 6;

        System.out.println("The sum is " + x + y); // Prints: The sum is 56
        System.out.println("The sum is " + (x + y));

        /*
         * final int myNum = 15;
         * myNum = 20; // Error: cannot assign a value to final variable 'myNum'
         */

    }
}