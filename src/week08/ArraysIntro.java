package week08;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        // i  want to put 5 numbers inside the variable
        // if we dont know the values need to use new keyword
        // we can put one value inside the one variable
        int a =5;
        // i  want to put multiple values in one variable
        // data type arrays symbol
              int         []          numbers = new int[5] ;

              numbers[0]=12;
              numbers[1]=13;
              numbers[2]=14;
              numbers[3]=15;
              numbers[4]=16;
              // how we can print that values
        System.out.println(Arrays.toString(numbers));
        // in order to print a
        System.out.println(a);

        //how to creat an array if we know the values
                    //index    0     1     2       3    4    5     6

        String [] weekdays = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        System.out.println("weekdays[3] = " + weekdays[3]);

        for (int i = 0; i < weekdays.length; i++) { //it is giving me the length of array
            System.out.println(weekdays[i]);

            //itar it will creat one fori loop then print your elements one by one

            for (int j = 0; j < weekdays.length; j++) {
                String weekday = weekdays[j];
                System.out.println(weekday);

            }
            System.out.println("__________________________________________");
            //print the elements
            for (String weekday : weekdays) {
                System.out.println(weekday);

            }

        }
        System.out.println("__________________________________________");
        String name = "Adam";

        // print the letter chars one by one

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));

        }
        for (char c : name.toCharArray()) {
            System.out.println(c);

        }
        // iter short cut
        for (String weekday : weekdays) {

        }

        System.out.println("________________________________________");

        // if you want to creat 2 dimensional array we need to use 2 [][]

        int [][]TwoDimensional = {
                {1,2,3}, // firts 1 dimensional array//index=0
                {4,5,6},// second  1 D array // index =1
                {7,8,9} // third 1 D array  // index= 2
        };
      // GET THE NUMBER 5
        System.out.println(TwoDimensional[1][1]);

        //get number 8
        System.out.println(TwoDimensional[2][1]);
        //get each elements one by one

        for (int i = 0; i < TwoDimensional.length; i++) {//first loop for gettint the 1 D arrays
            for (int j = 0; j < TwoDimensional[i].length; j++) {//second loop getting elements one by one

                System.out.println(TwoDimensional[i][j]);

            }

        }

        for (int[] EachDimensionalArray : TwoDimensional) {//  it is giving me 1 D array

            for (int eachElement:EachDimensionalArray){
                //this one getting element
                System.out.println(eachElement);

            }
            
        }

    }
}
