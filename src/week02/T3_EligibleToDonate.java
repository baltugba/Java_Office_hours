package week02;

import java.util.Scanner;

public class T3_EligibleToDonate {
    public static void main(String[] args) {
      //check the age
      // if it is greater than or equal 18

      //if not age is smaller than 18
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println("Enter your weight");
        int weight=scanner.nextInt();

        //check age
        if(age>=18){
         //if it is greater than or equal 18
         if(weight>50) {
             System.out.println("You are eligible to donate blood");
         }else{
             System.out.println("You are not eligible to donate blood");
         }
        }else{
            System.out.println("Age must be greater than 18");
        }


        /*

                            Create a program that accepts age and weight(kg) as int.

                            If age greater than or equal 18 and weight greater than 50 kg give a message
                                EXPECTED  :  "You are eligible to donate blood"

                            If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
                                EXPECTED  :  "You are not eligible to donate blood"

                            If age is smaller than 18 "Age must be greater than 18"
                                EXPECTED  :  "Age must be greater than 18"
         */
    }
}
