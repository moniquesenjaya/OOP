import java.util.Scanner;

public class WeekTwoExercise {
    public static void main(String[] args) {

        //Number 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int value = sc.nextInt();
        sc.nextLine();
        if (value == 0) {
            System.out.println("Number is neither even or odd");
        }else if (value%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        //Number 2
        int i = 1;
        while (i<=5){
            System.out.println("Monique");
            i++;
        }

        //Number 3
        int n = 7;
        do{
            System.out.println(n);
            n++;
        }while(n <= 12);

        //Number 4
        for (int b = 5; b>=1; b--){
            System.out.println(b);
        }
    }
}
