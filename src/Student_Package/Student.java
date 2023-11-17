package Student_Package;

public class Student {
    String name = "Jovelyn A. Rabago";
    String section = "IT24C";
    String motto = "Life is an adventure, never quit exploring it.";

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getMotto() {
        return motto;
    }

    public static void main(String[] args) {
        Student studentJ = new Student();

        System.out.println("Name: " + studentJ.getName());
        System.out.println("Section: " + studentJ.getSection());
        System.out.println("Motto: " + studentJ.getMotto());
    }
}
