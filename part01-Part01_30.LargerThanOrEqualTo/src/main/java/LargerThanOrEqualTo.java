
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scan.nextInt();
        System.out.println("Give the second number:");
        int b = scan.nextInt();
        if(a>b){
            System.out.println("Greater number is: "+a);
        }else if(b>a){
            System.out.println("Greater number is: "+b);
        }else{
            System.out.println("The numbers are equal!");
        }


    }
}
