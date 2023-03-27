package week06;

public class LoopIntro {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println("____________________________________");
         //starting point
        for (int i = 1; i <=7 ; i++) {
            System.out.println(i);

        }
        System.out.println("_______________________________________");
        //branching
        for (int i = 0; i <=100; i++) {
            if(i%2==1)
                continue;
            if(i==50)
                break;
                System.out.println(i);
            }

        }
    }

