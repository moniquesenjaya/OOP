import java.util.Scanner;

public class NumberOne {

    public static void main(String[] args) {
        int myAge = 18;
        int tenYears = 10;
        System.out.println("My age is " + 18);

        /** Number 2
         String is non primitive while char is primitive
         String uses double quotes, char use one quotation*/


        /** Number 3
         yes its possible*/

        char test = 67;
        System.out.println(test);


        double example = Double.parseDouble("23.7");
        String cool = Double.toString(example);
        System.out.println(example);
        System.out.println(cool);

        Scanner in = new Scanner(System.in);

        System.out.print("Input your name: ");
        String myName = in.nextLine();

        System.out.print("Input your age: ");
        int theAge = in.nextInt();


        System.out.println("Hello my name is " + myName + " and I will be " + (theAge+tenYears) + " years old in ten years");
    }
}
