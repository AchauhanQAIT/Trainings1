package Assignment3;

import java.util.Scanner;

/**
 *
 * @author qainfotech Abhinav Chauhan
 */
public class printingWeirdConditionalActions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int n = scan.nextInt();
        String output;
        if (n % 2 != 0) {
            output = "Weird";
        } else if (n >= 2 && n <= 5) {
            output = "Not Weird";
        } else if (n >= 6 && n <= 20) {
            output = "Weird";
        } else {
            output = "Not Weird";
        }

        System.out.println(output);

    }
}
