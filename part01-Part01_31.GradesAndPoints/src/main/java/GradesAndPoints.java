
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int a = scan.nextInt();
        if(a<0){
            System.out.println("Grade: impossible!");
        }else if(0<=a && a<=49){
            System.out.println("Grade: failed");
        }else if(49<a && a<=59){
            System.out.println("Grade: 1");
        }else if(59<a && a<=69){
            System.out.println("Grade: 2");
        }else if(69<a && a<=79){
            System.out.println("Grade: 3");
        }else if(79<a && a<=89){
            System.out.println("Grade: 4");
        }else if(89<a && a<=100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }
                      

    }
}
