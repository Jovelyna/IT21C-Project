package BankAccount_Package;

public class BankAccount {
    String name;
    int age;
    String accountNumber;
    double balance;

    public BankAccount(String name, int age, String accountNumber, double balance) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
            
public static void main(String[] args) {
        BankAccount Jovelyn = new BankAccount("Jovelyn rabago", 24, "20181231",1019199.0);

        System.out.println("Name: " + Jovelyn.getName());
        System.out.println("Age: " + Jovelyn.getAge());
        System.out.println("Account Number: " + Jovelyn.getAccountNumber());
        System.out.println("Balance: " + Jovelyn.getBalance());


    }
}
