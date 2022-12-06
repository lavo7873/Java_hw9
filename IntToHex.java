import java.util.*;
import java.util.Scanner;

public class IntToHex {

    public static void main(String[] args) {

        while (true)
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter an integer: ");
                int input = sc.nextInt();

                // convert to integer and then to hex
                String hex = Integer.toHexString(input).toUpperCase();

                // print output
                System.out.println(input + " is equivalent to \"" + hex + "\" in hexadecimal");
                int number = Integer.parseInt(hex, 16);
                System.out.println("Converting hexadecimal back to an integer value : " + number);
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid Input");
            }

    }

}
