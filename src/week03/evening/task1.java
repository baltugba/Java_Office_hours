package week03.evening;

public class task1 {
    public static void main(String[] args) {

        String str = "goodinstructor";
        if(str.substring(0,4).equals("good")||str.substring(1,5).equals("good")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
// second solution
        if(str.indexOf("good")<=1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
/*
Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.
input: goodinstructor --> true
input: agoodguy --> true
input: nogoodguy  --> false
 */