package week2;

public class WeekTwo {
    public static void main(String[] args) {

        //IF AND ELIF AND ELSE
        int n = 15;
        if (n<20){
            System.out.println("Number less than 20");
        }else if (n>30){
            System.out.println("Number greater than 30");
        }else{
            System.out.println("Number between 20 and 30");
        }

        //Switch

        int n2 = 40;
        switch(n2){
            case 20:
                System.out.println("Hello i am 20");
                break;
            case 30:
                System.out.println("Hello I am 30");
                break;
            default:
                System.out.println("Hello I am something else");
                break;
        }
        //for loops

        for (int i = 0; i<5; i++){
            System.out.println(i);
        }

        //while loops
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        //do while loops
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while (a<=5);
    }
}
