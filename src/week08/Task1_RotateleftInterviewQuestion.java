package week08;

import java.util.Arrays;

public class Task1_RotateleftInterviewQuestion {

    /*
      Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

            int[] x = {1,2,3};           // = > [2,3,1]
            int[] y = {17,12,10,8};      // = > [12,10,8,17]
            int[] a = {7,0,0};           // = > [0,0,7]
     */
    public static void main(String[] args) {

        int[] x = {1,2,3};
        /*
        x[0]=x[1];//get the 2. element put inside the fisrt element
        x[1]=x[2]//get the 3. element put inside the second element
        x[2]=temp;//get 1. element put inside the last

         */

        int temp = x[0];//we are storing our first data in order to use later

        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];//shifting data from right to lrft

        }
        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));


    }
}