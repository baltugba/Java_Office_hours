package week06;

public class MethodOverloading {
    public static void main(String[] args) {
    int result = sum(4,5);
    sum(4,5,6);
        multiplyWith2(result);
    }

    private static void multiplyWith2(int result) {
        System.out.println(result * 2);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2+ number3;
    }
}