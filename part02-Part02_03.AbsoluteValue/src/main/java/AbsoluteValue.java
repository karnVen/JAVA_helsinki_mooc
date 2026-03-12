
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a<0){
            int b=a*-1;
            System.out.println(b);
        }else{
            System.out.println(a);
        }

    }
}
