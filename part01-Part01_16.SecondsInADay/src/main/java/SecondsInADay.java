
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds? ");
        Integer i= Integer.valueOf(scanner.nextLine());
        int ans= i*24*60*60;
        System.out.println(ans);

        // Write your program here

    }
}
