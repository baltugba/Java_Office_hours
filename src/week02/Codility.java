package week02;

public class Codility {
    public static void main(String[] args) {

        int num = 30;
        if(num>0){
            String result ="";
            if(num %2==0){
                result+="Codility";
            }
            if(num%3==0){
                result+= "Test";
            }
            if(num%5==0){
                result+="Coders";
            }
            System.out.println(result);

        }else{
            System.out.println("negative number");
        }



    }





    /*
    Write a function:
            that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5
     */

}
