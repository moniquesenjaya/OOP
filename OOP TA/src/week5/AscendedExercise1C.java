package week5;

import java.util.*;

public class AscendedExercise1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<String> binusID = new Vector<>();
        Vector<String> name = new Vector<>();
        Vector<String> colour = new Vector<>();
        Vector<String> tempBinusID = new Vector<>();
        Vector<String> tempName = new Vector<>();
        Vector<String> tempColour = new Vector<>();

        binusID.add("2440077301");
        binusID.add("2440065163");
        binusID.add("2440071973");
        binusID.add("2440090266");
        binusID.add("2440065030");
        name.add("Jason");
        name.add("Ardelia");
        name.add("Raphael");
        name.add("Rohan");
        name.add("Chris");
        colour.add("White");
        colour.add("Black");
        colour.add("Red");
        colour.add("Black");
        colour.add("Black");

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
