package Person1;

public class TestProgram {
    public static void main(String[] args) {
        Student Jovelyn = new Student("Jovelyn Rabago", 1999, "Information Technology");
        System.out.println("Student");
        System.out.println(Jovelyn.toString());
        System.out.println();

        
        Instructor MaamPheobe = new Instructor("Pheobe Ruth Sulitario", 20000);
        System.out.println("Instructor");
        System.out.println(MaamPheobe.toString());
    }
}