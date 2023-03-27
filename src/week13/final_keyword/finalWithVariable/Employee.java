package week13.final_keyword.finalWithVariable;

public class Employee {

    private final String birthDay;
    private final String gender;
    private String name;

    public Employee(String birthDay, String gender, String name) {
        this.birthDay = birthDay;
        this.gender = gender;
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
