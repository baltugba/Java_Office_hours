package week12.task1;

public class MobileApp {

    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    // you are usning discord for 12 minutes
    public void useTheApp(int minutes){
        System.out.println(name+" is used for "+ minutes);
    }
    public void download(){
        System.out.println(" You are downloading "+ name+" with "+version);
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
/*
  Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
 */