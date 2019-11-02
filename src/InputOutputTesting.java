import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class InputOutputTesting {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("src/testInput.txt");
        Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter("src/testOutput.txt");

        double total = 0;

        while (input.hasNextDouble()) {
            double value = input.nextDouble();
            total += value;
        }

        output.println("Total: " + total);

        input.close();
        output.close();
    }
}