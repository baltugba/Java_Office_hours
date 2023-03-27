package week01.afternoon;

public class Task3 {
    public static void main(String[] args) {

        int pounds = 452;
        double kg = pounds*0.45;
        int inch = 72;
        double meter = inch* 0.0254;
        double BMI = kg/(meter*meter);
        System.out.println("BMI = " + BMI);
    }
}
