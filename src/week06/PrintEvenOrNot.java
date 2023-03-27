package week06;

public class PrintEvenOrNot {
    public static void main(String[] args) {

        printEvenOrNot(20);
        printEvenOrNot(25);

    }

    private static void printEvenOrNot(int number) {
        //implement the logic
        if(number %2==0){ //this number is even
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is not even");
        }
    }




    }


/*
  Write a method that can check if a number is even or not
  prime numare special num,greater than 1 that have exactly two factors themselves and 1
 */