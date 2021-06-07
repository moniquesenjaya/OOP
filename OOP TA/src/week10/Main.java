package week10;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", "Male", "Brown");

        myDog.breath();
        myDog.eat();
        myDog.barking();
        System.out.println(myDog.getColor());
        System.out.println(myDog.getGender());
        System.out.println(myDog.getName());
    }
}
