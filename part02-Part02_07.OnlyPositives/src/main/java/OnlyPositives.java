
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int a = scanner.nextInt();
            if(a<0){
                System.out.println("Unsuitable number");
                continue;
            }else if(a==0){
                break;
            }else{
                int b=a*a;
                System.out.println(b);
                continue;
            }
            
        }

    }
}
