import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("Cool Bank");
        System.out.println("Welcome to " + bank.getBankName());

        //While loop for the menu
        while (true){

            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            //Switch cases depending on the choice that is made
            switch(choice) {
                case 1:
                    System.out.println("New customer details");
                    System.out.print("Enter customer's first name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter customer's last name: ");
                    String lName = sc.nextLine();
                    //adds customer into list of customers in bank class
                    bank.addCustomer(fName, lName);
                    System.out.println(fName + " " + lName + " has been added as a new customer.");
                    break;
                case 2:
                    //Makes sure customer number is not 0
                    if (bank.getNumOfCustomers() != 0){
                        System.out.println("Customer List");
                        System.out.println("====================");
                        for (int i = 0; i < bank.getNumOfCustomers(); i++){
                            System.out.print((i+1) + ". ");
                            System.out.println(bank.getCustomer(i).getString());
                        }
                    }else{
                        System.out.println("No customer added yet.");
                    }
                    System.out.println();
                    break;
                case 3:
                    //Make sure customer is not equal 0
                    if (bank.getNumOfCustomers() != 0){
                        System.out.print("Input customer number: ");
                        int num = sc.nextInt();
                        sc.nextLine();
                        //get the details of a customer using index - 1 because the display starts from 1
                        Customer accCustomer = bank.getCustomer(num-1);
                        System.out.println("What to do in " + accCustomer.getString() + " bank.");
                        System.out.println("1. Withdraw");
                        System.out.println("2. Deposit");
                        System.out.print("Your choice: ");
                        int acc = sc.nextInt();
                        sc.nextLine();
                        //Another switch case to deal with the choice that is made
                        switch (acc) {
                            case 1 -> {
                                System.out.print("Enter the value to withdraw: ");
                                double amtW = sc.nextDouble();
                                sc.nextLine();
                                boolean check = accCustomer.getAccount().withdraw(amtW);
                                //checks if the method returns true or false (successful or failed)
                                if (check) {
                                    System.out.println("New balance: " + accCustomer.getAccount().getBalance());
                                } else {
                                    System.out.println("Balance not enough.");
                                }
                            }
                            case 2 -> {
                                System.out.print("Enter the value to deposit: ");
                                double amtD = sc.nextDouble();
                                sc.nextLine();
                                accCustomer.getAccount().deposit(amtD);
                                System.out.println("New balance: " + accCustomer.getAccount().getBalance());
                            }
                            default -> System.out.println("Invalid input.");
                        }
                    }else {
                        System.out.println("No customer added yet.");
                    }
                    break;
                case 4:
                    //Exits the program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input not available.");
            }

        }
    }

    public static void menu(){
        //Making a menu function to be printed in each iteration
        System.out.println("=======================");
        System.out.println("1. Add customer");
        System.out.println("2. Get customer list");
        System.out.println("3. Customer deposit/withdraw");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }
}
