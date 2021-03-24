package testing;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Square: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print(" ");
        for (int i = 0; i < num*2; i++){
            System.out.print("_");
        }
        System.out.print(" ");

        System.out.println();

        for (int i = 0; i<num-1; i++){
            System.out.print("|");
            for (int j = 0; j < num*2; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("|");
        for (int i = 0; i < num*2; i++){
            System.out.print("_");
        }
        System.out.print("|");
        System.out.println();

    }
}
