package Person1;

class Person {
    private String name;
    private double yearOfBirth;

    public Person(String name, double yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(double yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person [name:" + name + ", yearOfBirth:" + yearOfBirth + "]";
    }
}
