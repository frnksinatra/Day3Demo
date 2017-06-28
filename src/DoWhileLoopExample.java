/**
 * Created by Feras on 6/28/2017.
 * define variables
 *      interest rate
 *      future value
 *      monthly payment
 * need a counter
 * need a condition
 * need an iterator
 */
public class DoWhileLoopExample {
    public static void main(String[] args) {

        int i = 1;
        int months = 36;

        double futureValue = 0;
        double monthlyPmt = 330.63;
        double interestRate = 5.99/100;

        do {
            futureValue = (futureValue + monthlyPmt) * (1 + interestRate);
            i++;
        } while (i <= months);

        System.out.println(futureValue); //we put it after the while statement because we are only interested in the final number


    }
}
