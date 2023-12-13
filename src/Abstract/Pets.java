package Abstract;
abstract class Pets {
     abstract String color();
  
public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        System.out.println("My Dog's color is " + myDog.color());
        System.out.println("My Cat's color is " + myCat.color());
    }
}