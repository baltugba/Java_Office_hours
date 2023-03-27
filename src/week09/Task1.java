package week09;

public class Task1 {
    public static void main(String[] args) {

        // creating array if we know the elements
        int[] x = {2, 1, 2, 3, 4};
        int[] y = {2,2,0} ;
        int[] z = {1,3,5};
        //if we dont know the elements only knowing number of elements
        //int[]y = new int[10];

        int result = findNumberOfEvenNumbersInArray(x);
        int result1 = findNumberOfEvenNumbersInArray(y);
        int result2 = findNumberOfEvenNumbersInArray(z);
        System.out.println(result);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result1 = " + result1);
    }

    public static int findNumberOfEvenNumbersInArray(int[] array) {
        int counter = 0;

        //  i need to get element one by one
        for (int each : array) {
            //need to find element is divisible by 2

            if (each % 2 == 0) {// if yes I need to count it
                counter++;

            }

        }
        return counter++;

    }
}
/*
/*
1. Write a method that accepts an array and prints the number of even numbers in the
array.
int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0} = > 3
int[] z = {1,3,5} = > 0
 */
