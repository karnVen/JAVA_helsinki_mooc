
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int sum =0;
        while (true) {
            int a = scanner.nextInt();
            if(a==0){
                System.out.println("Cannot calculate the average");
            }
            if(a>0){
                sum=sum+a;
                num = num+1;
            }else if(a==0){
                break;
            }
            
        }
        double avg=(double)sum/num;
        System.out.println(avg);
    }
}
