package week06;

public class MethodIntro {
    public static void main(String[] args) {

        //print hello
        printHello();

        //print hello with name
        printHello("Tugba");
        sayHelloFromTo("tugba","tayfun");
    }
    public static void printHello(){
        System.out.println("Hello");
    }
                                 //argument
    public static void printHello(String name){
        System.out.println("Hello "+name);
    }
    public  static void sayHelloFromTo(String from,String to){
        System.out.println("Hello "+from + " to "+to);
    }
}
