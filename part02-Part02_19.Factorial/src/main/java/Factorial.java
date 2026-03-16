
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int a = scanner.nextInt();
        int b =1;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println("Factorial: "+b);

    }
}
