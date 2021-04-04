package week5;


public class AscendedExercise1A {
    public static void main(String[] args) {
        String[] binusID = {"2440065163", "2440077301",  "2440071973", "2440090266", "2440090266"};
        String[] name = {"Ardelia", "Jason",  "Raphael", "Rohan", "Chris"};
        String[] colour = {"Black", "White",  "Red", "Black", "Black"};

        for (int i = 0; i<5-1; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (name[i].compareTo(name[j])>0)
                {
                    String tempID = binusID[i];
                    String tempName = name[i];
                    String tempColour = colour[i];
                    binusID[i] = binusID [j];
                    name[i] = name [j];
                    colour[i] = colour [j];
                    name[j] = tempName;
                    binusID[j] = tempID;
                    colour[j] = tempColour;
                }
            }
        }
        System.out.println("Sort by Name");
        for (int i = 0; i<5; i++)
        {
            System.out.print(binusID[i] + "\t");
            System.out.print(name[i] + "\t");
            System.out.println(colour[i]);
        }


        for (int i = 0; i<5-1; i++)
        {
            for (int j = i+1 ; j<5; j++)
            {
                if (colour[i].compareTo(colour[j])>0)
                {
                    String tempID = binusID[i];
                    String tempName = name[i];
                    String tempColour = colour[i];
                    binusID[i] = binusID [j];
                    name[i] = name [j];
                    colour[i] = colour [j];
                    name[j] = tempName;
                    binusID[j] = tempID;
                    colour[j] = tempColour;
                }
            }
        }

        System.out.println("Sort by Colour");
        for (int i = 0; i<5; i++)
        {
            System.out.print(binusID[i] + "\t");
            System.out.print(name[i] + "\t");
            System.out.println(colour[i]);
        }

    }
}
