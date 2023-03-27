package week03.evening;

public class task4 {
    public static void main(String[] args) {

     String str = "result count :1234";
     // we need to find location : means in java use indexof method
        int indexOfColomn = str.indexOf(':');
        String result= str.substring(indexOfColomn+1).trim();
        System.out.println(result);

    }
}
/*
Task04
Dynamically locate the column (:) in the given result String, then just print out the numbers from the given result String using substring method. Your solution should be capable enough to work for different size of numbers or location of (:)
input1:  String result = "result count:12345";
output1:  12345
input1:  String result = "result count : 3007";
output1:  3007
 */