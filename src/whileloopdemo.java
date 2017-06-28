import java.util.Scanner;

/**
 * Created by Feras on 6/28/2017.
 */
public class whileloopdemo {
    public static void main(String[] args) {
        //System.out.println("hello world!");

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        //remember when comparing strings you have to use .equals() or .equalsIgnoreCase()

        while (choice.equalsIgnoreCase("y")) {

            //get some input from the user and do some stuff
            System.out.println("Would you like to continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("goodbye!");
    }
}
