/**
 * Created by Feras on 6/28/2017.
 */
public class WhileLoopExample2 {
    public static void main(String[] args) {
        //System.out.println("hello world!");

        int i = 1; //this is our counter variable -- it is common to use i,j, or k

        while (i < 5) {
            System.out.println("Loop " + i);
            i++;
            //different ways to increment
            // i++ or ++i
            // i = i + 1
            // i += 1
        }
        System.out.println("goodbye!");
    }
}
