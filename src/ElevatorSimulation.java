import java.util.Scanner;

public class ElevatorSimulation {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Floor:");
        System.out.println("test1"); // waits here for input. anything typed goes into the buffer
        // it will keep pulling any numbers typed with a space after them from the buffer each time
        // through the loop
        while (input.hasNextInt()) {
            System.out.println("test2");
            int floor = input.nextInt();
            System.out.println("test3");

            System.out.println("The elevator will travel to floor " + floor + ".");
            System.out.println("sleeping...");
            Thread.sleep(5000);
            System.out.println("FINISHED SLEEPING");
        }
    }
}
