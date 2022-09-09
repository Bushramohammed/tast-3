import java.util.Scanner;

public class Assigned4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter three numbers ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        if (num1<=num2&&num2<=num3&&num3>=num1){
            System.out.println("in order to");
        } else if (num1>=num2&&num2>=num3&&num3<=num1) {
            System.out.println("in order to");
        }
        else
            System.out.println("not in order to");
    }
}
