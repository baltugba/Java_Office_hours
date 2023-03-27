package week12.task2;

public class Computer {
    public String OS;
    public String memory;

    public Computer(String OS, String memory) {
        this.OS = OS;
        this.memory = memory;
    }
    public void start(){
        System.out.println(OS+" is starting");
    }
    public void shutdown(){
        System.out.println(OS+" is shutting down");
    }
    public void info(){
        System.out.println("The operating system is "+ OS+" the memory is "+memory+" Gb.");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "OS='" + OS + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
/*

  Create a class called Computer



            instance variables:
                os, memory

                add a constructor to set all the fields

            instance methods:

                start(), shutdown(), info()

        Create the following sub classes of Computer:

            1. Mac:

                    extra methods:
                        openSiri()
                        openSafari()

            2. Windows:

                    extra methods:
                       openEdge()
 */