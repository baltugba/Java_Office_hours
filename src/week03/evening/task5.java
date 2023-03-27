package week03.evening;

public class task5 {
    public static void main(String[] args) {
                 //01234
        String str="madam";
        char FirstFromLast = str.charAt(4); //m
        char SecondFromLast =str.charAt(3);//a
        char ThirdFromLast =str.charAt(2);//
        char ForthFromLast =str.charAt(1);
        char FifthFromLast =str.charAt(0);

        String reverse=""+FirstFromLast+SecondFromLast+ThirdFromLast+ForthFromLast+FifthFromLast;
        if(str.equals(reverse)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
/*
Task05
Reverse a given String of length 5, and if original and reversed strings are same print true
input: "madam" --------reversed word=madam
output : true
input: "hello"
output: false  --- reversed word= olleh
 */