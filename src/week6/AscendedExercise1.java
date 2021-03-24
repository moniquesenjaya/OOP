package week6;
import java.util.Random;
import java.util.Scanner;

public class AscendedExercise1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Even Odd numbers");
        for (int i = 0; i<=100; i++){
            int n = rand.nextInt(1000);
            System.out.println(n+ ": "+ evenOdd(n));
        }


        System.out.println("Vowel Checker");
        System.out.print("Enter String: ");
        String sentence = sc.nextLine();
        int counter = 0;
        for (int i = 0; i<sentence.length(); i++){
            char ch=sentence.charAt(i);
            if (vowelCheck(ch))
                counter++;
        }
        System.out.println("Vowels: " + counter);


        System.out.println("Prime numbers");
        for (int a = 1; a<=500; a++){
            if (prime(a))
                System.out.print(a + " ");
        }
    }

    static boolean prime(int a){
        boolean flag = false;
        if (a>1){
            for (int i=2; i<a; i++){
                if (a % i == 0) {
                    flag = true;
                    break;
                }
            }
        }else{
            return false;
        }

        return !flag;
    }

    static String evenOdd(int a){
        if (a%2==0){
            return "even";
        }else{
            return "odd";
        }
    }

    static boolean vowelCheck(char a){
        return Character.toLowerCase(a) == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }

}
