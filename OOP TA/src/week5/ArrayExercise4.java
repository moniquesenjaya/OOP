package week5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise4 {
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

        System.out.println("Reversed Array: ");

        for (int i = 0; i < arr.length / 2; i++) {
            // Store first value in tempVar
            int temp = arr[i];
            // Change first value with value at opposite end
            arr[i] = arr[arr.length - i - 1];
            // Change value at opposite end with tempVar
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

