package week01.morning;

public class Task01 {
    public static void main(String[] args) {


/*
Declare and assign value to Variables
DataType variable = VALUE;
DataType variable 1, variableName2;
variableName1 = value;
variableName 2 = value;
 */
  int firstInt= 26;
  int secondInt= 5;
  int sum, difference,product,max,min;
  double average;
  int averageInt;
  // arithmetic operators
        sum= firstInt+secondInt;
        System.out.println("sum = " + sum);

        difference= firstInt-secondInt;

        System.out.println("difference = " + difference);

        product = firstInt*secondInt;
        System.out.println("product = " + product);

        average=(firstInt+secondInt)/2; // datatype ---> double
        System.out.println("average = " + average);
// we are adding two integers and dividing by a number assign it to double variable:implicit casting

average=(double) (firstInt+secondInt)/2;
//(double) (firstInt+secondInt--- explicit casting is done by coder(person)
        System.out.println("average = " + average);

        averageInt=(int) average;//bigger data type is trying to fit into smaller data type

/*
Conditional Statements: if-else---- work with boolean results
if(condition){true: do this} else {do something else}
condition should produce boolean result
Relational Operators: >,<,==,!>,>=,<=
logical Operators: &,|,&&,||
 */

boolean isMaxFirstInteger = firstInt>secondInt;
        System.out.println("isMaxFirstInteger = " + isMaxFirstInteger);
        if(isMaxFirstInteger){
            max=firstInt;
            min=secondInt;


        }else{
            max= secondInt;
            min= firstInt;
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);





 /*
  Task 1:
Write a Java program that accepts two integers and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
Input Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output:
Input 1st integer: 25
Input 2nd integer: 5
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
  */


    }
}
