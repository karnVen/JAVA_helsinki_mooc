import java.lang.*;
import java.util.*;

class BooleanInput{

public static void main(String args []){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something: ");

    boolean boo= Boolean.valueOf(scanner.nextLine());

    System.out.println("True or false? "+ boo);


}
}