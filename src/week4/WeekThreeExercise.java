package week4;

import java.util.Scanner;

public class WeekThreeExercise {
    public static void main(String[] args) {
        // float arr[] = {65, 3.4, 4.3f}

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

//        for(int i = 0; i<5; i++){
//            System.out.print("Input a number: ");
//            arr[i] = sc.nextInt();
//            sc.nextLine();
//        }
        System.out.print("Input 5 numbers: ");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i = 4; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Enter an item: ");
        int search = sc.nextInt();
        sc.nextLine();
        boolean check = false;
        for(int i = 4; i>=0; i--){
            if (search == arr[i]){
                System.out.println(i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("-1");
        }

        //An array is a data structure/container/object that stores a fixed-size sequential
        // collection of elements of the same type. The size/length of the array is determined
        //at the time of creation. You can change the size of the existing array by reassigning it to the new one


    }

}
