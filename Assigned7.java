import java.util.Scanner;

public class Assigned7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter month number from 1 to 12(1=jan,and 12=Dec):");
        int month=input.nextInt();

        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("\n 31 days in this month");
        }
       else if (month==4||month==6||month==9||month==11){
            System.out.println("\n 30 days in this month");
        }
       else if (month==2) {
            System.out.println("\n Either 28 or 29 days in this month");
        }
       else
            System.out.println("Please enter valid number between 1 to 12");
    }
}
