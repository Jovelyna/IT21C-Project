package Person1;

public class Student extends Person{
    private String major;

    public Student(String name, double yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
public String toString() {
    return "Name:" + getName() + "  Birthyear:" + getYearOfBirth() + "   Major:" + major + "";
}
}
