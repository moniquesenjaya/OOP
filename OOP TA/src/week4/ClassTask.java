package week4;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {

        // initial declaration
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int choice = 0;
        char direction;
        int distance;

        System.out.println("Welcome to Robby program.");

        //while loop for the menu driven program
        while(choice != 4){

            //system output to get user input
            System.out.println("===================");
            System.out.println("1. Location");
            System.out.println("2. Move");
            System.out.println("3. Reset");
            System.out.println("4. Quit");
            System.out.print("Your choice (1,2,3,4): ");
            choice = sc.nextInt();
            sc.nextLine();

            //checks what the user wants to do
            switch(choice){

                case 1:

                    //when the x and y is 0 its in the origin, if not print with x and y
                    if (x==0 && y==0){
                        System.out.println("Robby is located at the origin (0,0)");
                    }else{
                        System.out.println("Robby is located at (" + x + "," + y + ")");
                    }
                    break;

                case 2:
                    //Input the direction
                    System.out.print("Enter the direction (N,E,W,S) >> ");
                    direction = sc.next().charAt(0);
                    sc.nextLine();

                    //Distance input
                    System.out.print("Enter distance (n>0) >> ");
                    distance = sc.nextInt();
                    sc.nextLine();

                    //Check the direction first and add or subtract according to the distance input
                    switch (direction) {
                        case 'N' -> y += distance;
                        case 'E' -> x += distance;
                        case 'W' -> x -= distance;
                        case 'S' -> y -= distance;
                    }
                    System.out.println("Robby is now located at (" + x + "," + y + ")");
                    break;

                //Reset and make x and y equals 0
                case 3:
                    x = 0;
                    y= 0;
                    System.out.println("Robby is reset to the origin (0,0)");
                    break;

                //To stop the program
                case 4:
                    System.out.println("Program is terminated!");
                    break;

                //Just in case the user input is incorrect
                default:
                    System.out.println("Please input the right choices (1,2,3,4)!");
                    break;

            }

        }

    }
}
