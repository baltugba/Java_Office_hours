package week01.morning;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("25/10=" + 25/10); //2
        System.out.println("25%10=" + 25%10);  //5

        int number = 702; // declare and assign value
        int digit1s, digit10s,digit100s;
        int remainingNumber;

        digit1s= number %10;  // get the last number by using module operators with num 10
        remainingNumber=number /10;// how to get rid of  digit(right to left) that we have found before
        System.out.println("digit1s = " + digit1s); //5
        System.out.println("remainingNumber = " + remainingNumber); //56

        digit10s= remainingNumber% 10;//get the last number by using module operators with num 10
       // remainingNumber = remainingNumber /10;
        remainingNumber /= 10; // short hand operators
        System.out.println("digit10s = " + digit10s);
        System.out.println("remainingNumber = " + remainingNumber);

        digit100s = remainingNumber %10;
        System.out.println("digit100s = " + digit100s);

        int sum =  digit1s + digit10s+digit100s;
        System.out.println("sum = " + sum);





  /*
   Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
An integer is a number that can be written without a fractional component. For example, 23, 6, 0, and −1245 are integers.
Input Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
   */
    }
}
