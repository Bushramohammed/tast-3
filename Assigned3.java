import java.util.Scanner;

public class Assigned3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("inter three numbers");
        int x =input.nextInt();
        int y =input.nextInt();
        int z =input.nextInt();
        if (x==y&&x==z){
            System.out.println("all the same");
        }
        else {
            System.out.println("all different");
        }
    }
}
