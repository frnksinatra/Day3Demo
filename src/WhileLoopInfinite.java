/**
 * Created by Feras on 6/28/2017.
 */
public class WhileLoopInfinite {
    public static void main(String[] args) {

        while (true) {
            // this code will run endlessly

            //System.out.println("looping");

            //do break out of this loop you will want
            //to include a conditional statement
            //to break out of the loop -- you can use the
            //keyword break

            int randomNumber= (int) (Math.random() * 10); //generates a random # 0 -10
            System.out.println(randomNumber);

            if (randomNumber == 7) {
                System.out.println("value is found -- exit loop");
                break;
            }

        }
        System.out.println("continue statement example below");
        for (int i = 0; i < 5; i++) {
            int randomNumber2= (int) (Math.random() * 10);
            if (randomNumber2 > 7) {
                System.out.println("invalid number -- continue loop");
                continue;
        }
            System.out.println(randomNumber2); // this will only execute if randomNum2 is <= 7
    }
}}
