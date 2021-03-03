import java.util.Scanner;

public class ExtendedExercise {
    public static void main(String[] args) {

        // Number 1
        System.out.println("=======================\nWEIGHT CONVERSIONS");
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the mass: ");
        float mass = in.nextFloat();

        in.nextLine();

        System.out.print("Enter the name of planet: ");
        String planet = in.nextLine();

        System.out.print("Enter the gravitational acceleration in " + planet +": ");
        float g = in.nextFloat();
        in.nextLine();

        System.out.println("The weight in " + planet + " is: " + (mass*g));


        //Number 2

        //Number 3
        System.out.println("=======================\nBMI CALCULATOR");
        System.out.print("Enter your height in m: ");
        float height = in.nextFloat();
        in.nextLine();

        System.out.print("Enter your mass in kg: ");
        float weight = in.nextFloat();
        in.nextLine();


        double BMI = (float) weight/(Math.pow(height,2));

        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5){
            System.out.println("You are Underweight.");
        }else if (BMI <= 25){
            System.out.println("You have a normal weight.");
        }else if (BMI <= 30){
            System.out.println("You are overweight.");
        }else if (BMI > 30){
            System.out.println("You are obese.");
        }

    }
}
