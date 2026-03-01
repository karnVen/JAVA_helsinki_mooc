
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        Integer a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        Integer b = Integer.valueOf(scanner.nextLine());

        double avg=(double) (a+b)/2.0 ;

        System.out.println("The average is " + avg);

    }
}
