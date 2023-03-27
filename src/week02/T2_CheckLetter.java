package week02;

public class T2_CheckLetter {

    public static void main(String[] args) {

        char ch='@';
        if(ch>='A'&&ch<='Z'){
            System.out.println(ch+ " is an Upper Case ");
        }else if(ch>='a'&& ch<='z'){
            System.out.println(ch + " is a lower case");
        }else{
            System.out.println(ch + " is not alphabetic");
        }





        /*
       :
 Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
         */
    }
}
