package week5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AscendedExercise1B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> binusID = new ArrayList<String>(
                Arrays.asList("2440077301", "2440065163" ,  "2440071973", "2440090266", "2440065030"));
        ArrayList<String> name = new ArrayList<String>(
                Arrays.asList("Jason", "Ardelia",  "Raphael", "Rohan", "Chris"));
        ArrayList<String> colour = new ArrayList<String>(
                Arrays.asList("White",  "Black", "Red", "Black", "Black"));
        ArrayList<String> tempBinusID = new ArrayList<String>();
        ArrayList<String> tempName = new ArrayList<String>();
        ArrayList<String> tempColour = new ArrayList<String>();

        System.out.println("Data Before Sorting");
        for(int i = 0; i <5; i++)
        {
            System.out.print(binusID.get(i) + "\t");
            System.out.print(name.get(i) + "\t");
            System.out.println(colour.get(i));
        }

        Integer[] srcIndexes = new Integer[binusID.size()];

        //  Assign indexes
        for (int i = 0; i < binusID.size(); ++i)
            srcIndexes[i] = i;

        Arrays.sort(srcIndexes, Comparator.comparing(binusID::get));


        System.out.println("Data After Sorting");

        for (int i=0; i<5; i++)
        {
            tempBinusID.add(binusID.get(srcIndexes[i]));
            tempName.add(name.get(srcIndexes[i]));
            tempColour.add(colour.get(srcIndexes[i]));
        }

        System.out.println("Sort by BinusID");
        for (int i = 0; i<5; i++)
        {
            System.out.print(tempBinusID.get(i) + "\t");
            System.out.print(tempName.get(i) + "\t");
            System.out.println(tempColour.get(i));
        }

        System.out.println("");
        System.out.print("Enter the BinusID: ");
        String search = sc.nextLine();

        boolean check = false;

        for (int i = 0; i<5; i++){
            if (search.equals(tempBinusID.get(i))){
                System.out.println(search + " is found at " + i);
                check = true;
            }
        }
        if (!check){
            System.out.println(search + " is not found. -1.");
        }


    }
}
