
import java.io.*;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {

        try {

            String FileName = "command_line_input.txt";
            Scanner sc = new Scanner(System.in);

            File file = new File(FileName); // file object
            FileWriter fWriter = new FileWriter(file, true); // file writer with append mode on
            System.out.println("Program Started!\n");

            String userInput;
            while (true) {

                System.out.print("> ");

                userInput = sc.nextLine();

                // break when user enters "@q"
                if (userInput.equals("@q")) {
                    break;
                }
                fWriter.append(userInput);
                fWriter.append("\n");

                // printer.println(userInput);
            }

            // close the writers
            sc.close();

            fWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
