
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int c=scanner.nextInt();
        System.out.println("Last number? ");
        int a =scanner.nextInt();
        int b=0;
        for(int i =c;i<=a;i++){
            b= b+i;
        }
        System.out.println("The sum is "+b);


    }
}
