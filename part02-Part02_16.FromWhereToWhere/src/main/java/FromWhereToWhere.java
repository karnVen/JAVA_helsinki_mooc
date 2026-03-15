
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        for(int i =b;i<=a;i++){
            System.out.println(i);
        }

        // Write your program here
    }
}
