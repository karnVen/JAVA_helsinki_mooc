
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        while (true) {
            System.out.println("Give a number:");
            int a = scanner.nextInt();
            if(a==0){
                break;
            }else{
                sum=sum+a;
            }
        }
        System.out.println("Sum of the numbers: "+sum);

    }
}
