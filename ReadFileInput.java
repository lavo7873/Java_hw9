import java.io.*;
import java.util.Scanner;

public class ReadFileInput {

    public static void main(String[] args) {
        try {
            String fileInput = "quote.txt";
            File file = new File(fileInput);
            Scanner sc = new Scanner(file);

            // keep reading as long as there are lines remaining
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
