package testing;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Triangle: ");
        int num = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < num; i++){
            for (int k=num; k>i; k--){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i*2; j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            System.out.println();
        }


        System.out.print("/");
        for (int i = 0; i < num*2; i++){
            System.out.print("_");
        }
        System.out.print("\\");
    }
    public int mult(int a, int b){
        return a*b;
    }
}
