
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int sum=0;
        while (true) {
            System.out.println("Give a number:");
            int a = scanner.nextInt();

            if(a==0){
                break;

            }else {
                sum=sum+a;
                num=num+1;
            }
        }
        double avg=(double)sum/num;
        System.out.println("Average of the numbers: "+ avg);

    }
}
