package week2;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class AscendedExercise {
    public static void main(String[] args) {
        //Number 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        int h = sc.nextInt();
        sc.nextLine();
        System.out.print("1. Right angled triangle leaning to the left\n2. Upside down right angled triangle leaning to the right\n3. Isosceles triangle\n");
        System.out.print("What triangle do you want to print: ");
        int choice = sc.nextInt();
        sc.nextLine();


        switch(choice) {
            case 1:
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print('*');
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int k = h; k >= 1; k--) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print('*');
                    }
                    System.out.println("");
                }
                break;
            case 3:
                int star = 1;
                for (int m = 1; m <= h; m++) {

                    for (int n = 1; n <= h - m; n++) {
                        System.out.print(" ");
                    }
                    for (int o = 1; o <= star; o++) {
                        System.out.print('*');
                    }
                    for (int n = 1; n <= h - m; n++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    star += 2;
                }
                break;
        }

        //Number 2
        System.out.print("Length: ");
        int fLength;
        int length = sc.nextInt();
        sc.nextLine();
        if (length%2 == 1){
            fLength = length++;
        }else{
            fLength = length;
        }
        for (int i = 0; i<fLength/2; i++){
            for (int j=0; j<length;j++){
                if (i == 0){
                    System.out.print("*");
                }else if (j == i || j == length-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println("");

        }
        for (int i = (length/2)-1; i>=0; i--){
            for (int j=0; j<length;j++){
                if (i == 0){
                    System.out.print("*");
                }else if (j == i || j == length-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println("");

        }


        //Number 3
        int[] arr = new int[20];
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i<arr.length; i++){
            System.out.print("Input the number in index " + i + " : ");
            arr[i] = sc.nextInt();

            if (arr[i]>0){
                positive++;
            }
            if (arr[i]<0){
                negative++;
            }
            if (arr[i]%2==0){
                even++;
            }
            if (arr[i]%2==1){
                odd++;
            }
            if (arr[i]==0){
                zero++;
            }
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);
        System.out.println("Zero: "+zero);

    }
}
