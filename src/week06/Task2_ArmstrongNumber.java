package week06;

public class Task2_ArmstrongNumber {
    public static void main(String[] args) {

        boolean result =isArmstrongNumber(153);
        System.out.println("result = "+result);
    }

    public static boolean isArmstrongNumber(int number) {
        int first = getFirstDigit(number);//1
        int second = getSecondDigit(number);//5
        int third = getThirdDigit(number);//3

        int result = first*first*first + second*second*second+third*third*third;
        if(result==number)
            return true;
        else
            return false;
    }

    private static int getThirdDigit(int number) {
        return number%10;//it will give you last digit
    }

    private static int getSecondDigit(int number) {
        return number/10%10;
    }

    private static int getFirstDigit(int number) {
        return number/100;
    }


}
/*
 Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */