/**
 * Created by Feras on 6/28/2017.
 *
 * for loop that stores numbers 0 - 4 in a string
 */
public class ForLoopExample {
    public static void main(String[] args) {

        String numbers = "";

        for (int i = 0; i < 5; i++) {
            numbers += i;
            numbers += " ";
        }
        System.out.println(numbers);
    }
}
