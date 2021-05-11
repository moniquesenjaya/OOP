package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tour {
    public static void main(String[] args) {
        ArrayList<String> dataTour = new ArrayList<>();
        ArrayList<String[]> indivData = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("TourDetails.txt"));
            while (scanner.hasNextLine()) {
                dataTour.add(scanner.nextLine());
            }
            scanner.close();

            for (String data:dataTour){
                String[] indivCaseData = data.split(" "); //[10, 50.0, 60.5]
                indivData.add(indivCaseData);// [[10, 50.0,60.5]]
            }

                for (int i=0; i < indivData.size(); i++){
                    int numberCars = (int) Math.ceil(Integer.parseInt(indivData.get(i)[0])/4.0);
                    double costOfCar = numberCars * Double.parseDouble(indivData.get(i)[1]);
                    double costOfTicket = Integer.parseInt(indivData.get(i)[0]) * Double.parseDouble(indivData.get(i)[2]);
                    double costAvg = (costOfCar+costOfTicket)/Integer.parseInt(indivData.get(i)[0]);
                System.out.println("Case " + (i+1) + ":");
                System.out.println("Number of cars required: " + numberCars);
                System.out.println("Cost per person: " + costAvg);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
