import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("Cool Bank");
        System.out.println("Welcome to " + bank.getBankName());
        while (true){

            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(choice) {
                case 1:
                    System.out.println("New customer details");
                    System.out.print("Enter customer's first name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter customer's last name: ");
                    String lName = sc.nextLine();
                    bank.addCustomer(fName, lName);
                    System.out.println(fName + " " + lName + " has been added as a new customer.");
                    break;
                case 2:
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
                    if (bank.getNumOfCustomers() != 0){
                        System.out.print("Input customer number: ");
                        int num = sc.nextInt();
                        sc.nextLine();
                        Customer accCustomer = bank.getCustomer(num-1);
                        System.out.println("What to do in " + accCustomer.getString() + " bank.");
                        System.out.println("1. Withdraw");
                        System.out.println("2. Deposit");
                        System.out.print("Your choice: ");
                        int acc = sc.nextInt();
                        sc.nextLine();
                        switch (acc) {
                            case 1 -> {
                                System.out.print("Enter the value to withdraw: ");
                                double amtW = sc.nextDouble();
                                sc.nextLine();
                                boolean check = accCustomer.getAccount().withdraw(amtW);
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
