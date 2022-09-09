import java.util.Scanner;

public class Assigned5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter three numbers");
       int x = input.nextInt();
       int y = input.nextInt();
       int z = input.nextInt();
        if (x<y&&y<z){
            System.out.println("increasing");
        }
        if (x>y&&y>z){
            System.out.println("decreasing");
        }
        else {
            System.out.println("neither");
        }
    }
}
