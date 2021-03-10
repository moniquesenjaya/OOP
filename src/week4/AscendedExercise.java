package week4;

public class AscendedExercise {
    public static void main(String[] args) {
        //creating two matrices and making a new empty one
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        mDot(a, b);
        mMult(a,b);


    }

    public static void mMult(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        //creating two matrices and making a new empty one
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();//new line
        }
    }

    public static void mDot(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        //creating two matrices and making a new empty one

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = 0;
                for (int k = 0; k<3; k++){
                    num += a[i][k] * b[k][j];
                }
                    System.out.print(num + " ");
                }
                System.out.println(" ");
            }

        }
    }
