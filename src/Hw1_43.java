// CLASS: Hw1_43
// Kristin Brooks, krbrook7, krbrook7@asu.edu

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Hw1_43 {
    public static void main(String[] pArgs) {
        new Hw1_43().run();
    }
    public Hw1_43() {
    }
    private void run() {
        // prompt the user and input their java source code file name
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name of the java source code file: ");
        String inputFileName = userInput.next();

        Scanner input;
        PrintWriter output;
        try {
            // construct the objects for reading the user's file and outputting the text file
            input = new Scanner(new File(inputFileName));
            String outputFileName = inputFileName + ".txt";
            output = new PrintWriter(outputFileName);

            // read the input file and output to the .txt file
            int lineNumber = 1;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                output.printf("[%03d] ", lineNumber);
                output.println(line);
                lineNumber += 1;
            }

            // close files
            input.close();
            output.close();

        } catch (FileNotFoundException exception) {
            System.out.println("File Not Found. Terminating Program.");
        }
    }
}
