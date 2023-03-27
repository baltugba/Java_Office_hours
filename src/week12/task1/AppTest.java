package week12.task1;

public class AppTest {
    public static void main(String[] args) {

        Instagram instagram = new Instagram(5.6);
        System.out.println(instagram);
        instagram.download();

        Discord discord = new Discord(7.6);
        System.out.println(discord);
        discord.download();

    }
}
