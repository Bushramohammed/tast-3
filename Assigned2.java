import java.util.Scanner;

public class Assigned2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter integer number");
        int num = input.nextInt();
        if (num<0){
            System.out.println("the number is negative");
        }
        else if (num>0) {
            System.out.println("the number is positive");

        }
        else if (num==0) {
            System.out.println("the number is zero");

        }
    }
}
