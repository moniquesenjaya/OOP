package week9;

public class Person {
    private int height;
    private int weight;

    public Person(){
        this.height = 180;
        this.weight = 60;
    }

    public void greet(){
        System.out.println("Hello!");
    }

    public static void goodbye(){
        System.out.println("Goodbye!");
    }
}
