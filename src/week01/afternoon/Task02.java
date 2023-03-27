package week01.afternoon;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(15%10); // 5
        System.out.println(15/10); // 1
        //654
        // if we want to get last digit which is 5 use the % with 10
        System.out.println("lastDigit:"+654%10); //4
        int lastDigit=654%10;
        // how we can get first two digit if we divide with 10 we can get first two digit which is 65
        //65%10--5
        System.out.println("second digit;"+654/10%10); //65
        int secondDigit=654/10%10;
        // how we can get the first digit only if we divide with 100 we can easly get the first digit

        System.out.println("firstDigit:"+654/100); //6
        int fistDigit =654/100;
        int sum= fistDigit+secondDigit+lastDigit;




    }
}
