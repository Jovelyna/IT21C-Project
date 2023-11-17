package Person_Package;

import java.time.LocalDate;

public class Person {
    String name;
    LocalDate birthDate;

    Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
    }

    public static void main(String[] args) {
        LocalDate birthDate1 = LocalDate.parse("2021-04-01");
        LocalDate birthDate2 = LocalDate.parse("2015-04-01");
        LocalDate birthDate3 = LocalDate.parse("2011-01-15");


        Person Employee1 = new Person("Roberta Petrus",birthDate1);
        Person Employee2 = new Person("Loyd Blair", birthDate2);
        Person Employee3 = new Person("Magdalena Artemon", birthDate3);

        Employee1.printDetails();
        System.out.println();
        Employee2.printDetails();
        System.out.println();
        Employee3.printDetails();

    }
}

