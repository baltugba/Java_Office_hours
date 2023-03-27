package week06;

public class Task1_PrintPrimeOrNot {
    public static void main(String[] args) {

        //7
        printNumberPrimeOrNot(7);
        printNumberPrimeOrNot(4);

    }

    public static void printNumberPrimeOrNot(int number) {
        boolean isPrime =true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }

        }
        if(number<=1){
            isPrime = false;
        }


        if(isPrime){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is not prime ");
        }
    }
}
/*
 Write a method that can check if a number is prime or not
				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
 */