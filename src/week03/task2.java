package week03;

public class task2 {
    public static void main(String[] args) {
       String str="educated";


       //we need to get first two character
        String firstPart = ""+str.charAt(0)+str.charAt(1);// str.substring(0,2);

        //we need to get last two chars

        String lastPart = ""+str.charAt(str.length()-2)+str.charAt(str.length()-1);//str.substring(str.lenght()-2;
        if(firstPart.equals(lastPart)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }




    }
}
/*
Write a Java program to check whether the first two characters present at the end of a given string.
The given strings is: educated
The first two characters appear in the last is: true
 */