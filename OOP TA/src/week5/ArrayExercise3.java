package week5;

import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of value of the array: ");
        int value = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[value];


        System.out.print("Input " + value + " numbers: ");
        for(int i = 0; i<value; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter an item to search: ");
        int search = sc.nextInt();
        sc.nextLine();
        boolean check = false;
        for(int i = 0; i<value; i++){
            if (search == arr[i]){
                System.out.println(search + " found in index " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(search + " not found.");
        }
    }
}
