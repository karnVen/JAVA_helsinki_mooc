
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        Integer a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        Integer b = Integer.valueOf(scanner.nextLine());
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        double div= (double) a/b;
        System.out.println(a+" + "+b+" = "+ add);
        System.out.println(a+" - "+b+" = "+ sub);
        System.out.println(a+" * "+b+" = "+ mul);
        System.out.println(a+" / "+b+" = "+ div);

    }
}
