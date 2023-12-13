package Person1;

 class Instructor extends Person {
    private double salary;

    public Instructor(String name, double salary) {
        super(name, salary);
        this.salary = salary;
        
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return "Name:" + getName() + "   Salary:" + salary +"";
    }
}