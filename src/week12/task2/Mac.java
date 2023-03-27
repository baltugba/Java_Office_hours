package week12.task2;

public class Mac extends Computer{

    public Mac( String memory) {
        super("Mac OS", memory);
    }
    public void openSiri(){
        System.out.println("Siri is opening in the Mac");
    }
    public void openSafari(){
        System.out.println("Safari is specific to mac user which is opening");
    }
}
/*
 1. Mac:

                    extra methods:
                        openSiri()
                        openSafari()
 */