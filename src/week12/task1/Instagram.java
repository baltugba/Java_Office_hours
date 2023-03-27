package week12.task1;

public class Instagram extends MobileApp{

    public Instagram(double version) {
        super("Instagram", version);
    }
    public void postPhoto(){
        System.out.println("I am sending photo "+ name);
    }
}
// extra method:
//postPhoto()