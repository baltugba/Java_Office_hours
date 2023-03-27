package week06;

public class MethodCallingMethod {
    public static void main(String[] args) {
        callAFromMain();
    }

    public static void callAFromMain() {
        callBFromA();
        System.out.println("A");
    }

    public static void callBFromA() {
        System.out.println("B");
    }
}
