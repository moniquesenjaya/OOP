package week1;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the direction (W,E,S,T) >> ");
        char direction = sc.next().charAt(0);
        sc.nextLine();
        System.out.println(direction);
    }
}
