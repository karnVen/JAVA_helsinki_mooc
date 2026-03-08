
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scan.nextInt();
        if(num>0){
            System.out.println("The number is positive.");           
        }else{
            System.out.println("The number is not positive.");
        }

        // Write your program here
    }
}
