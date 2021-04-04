package week4;

import java.util.Scanner;

public class AscendedExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of row of matrix 1: ");
        int row1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Input the number of column of matrix 1: ");
        int column1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Input the number of row of matrix 2: ");
        int row2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Input the number of column of matrix 2: ");
        int column2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Choose what to do (1)Dot (2)Mult: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1){
            if (column1 != row2){
                System.out.println("The matrix cannot be multiplied");
            }else{
                int[][] a = new int[row1][column1];
                int[][] b = new int[row2][column2];

                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.print("Enter the number of first matrix [" + (i + 1) + " , " + (j + 1) + "]: ");
                        a[i][j] = sc.nextInt();
                        System.out.println();
                    }
                }

                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++) {
                        System.out.print("Enter the number of second matrix [" + (i + 1) + " , " + (j + 1) + "]: ");
                        b[i][j] = sc.nextInt();
                        System.out.println();
                    }
                }
                mDot(a,b, row1, column2);

            }
        }else if (choice == 2){
            if (column1 != column2 || row1 != row2){
                System.out.println("The matrix cannot be multiplied");
            }else{
                int[][] a = new int[row1][column1];
                int[][] b = new int[row2][column2];

                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.print("Enter the number of first matrix [" + (i + 1) + " , " + (j + 1) + "]: ");
                        a[i][j] = sc.nextInt();
                        System.out.println();
                    }
                }

                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++) {
                        System.out.print("Enter the number of second matrix [" + (i + 1) + " , " + (j + 1) + "]: ");
                        b[i][j] = sc.nextInt();
                        System.out.println();
                    }
                }
                mMult(a,b, row1, column2);
            }
        }








    }

    public static void mMult(int[][] a, int[][] b, int row1, int column2) {
        int[][] c = new int[row1][column2];
        System.out.println("Matrix Multiplication");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                int num = 0;
                for (int k = 0; k<c[i].length; k++){
                    num += a[i][k] * b[k][j];
                }
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }

    public static void mDot(int[][] a, int[][] b, int row1, int column2) {
        System.out.println("Dot Matrix");
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i] += a[i][j] * b[i][j];
            }
            System.out.print(c[i] + " ");
        }
    }
}