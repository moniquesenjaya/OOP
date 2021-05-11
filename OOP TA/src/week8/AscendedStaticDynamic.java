package week8;

public class AscendedStaticDynamic {
    public static void main(String[] args) {
        //For the first number, either remove the keyword static from the method of sleep, or change the declaration class to Dog

        Person a = new Person();
        Person b = new Teacher();

        //dynamic
        a.greet();
        b.greet();

        //static
        a.goodbye();
        b.goodbye();
    }
}
