package week12.task1;

public class Discord extends MobileApp{

    // IF WE DO NOT HAVE CONSTRUCTOR IN A CLASS COMPILER IS CREATING ONE FOR US WHICH IS DEFAULT

    public Discord(double version) {
        super("Discord", version);
    }
    public void chat(String name){
        System.out.println("I am chatting with "+name+" with discord");
    }
}
/*
 2. Discord:
                    extra methods:
                        chat(String name)
 */