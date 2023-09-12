package assign01_02;

import java.util.Scanner;

public class doubleAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first double: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a valid double.");
            return; // Terminate the program
        }
        double firstDouble = scanner.nextDouble();

        System.out.print("Enter the second double: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a valid double.");
            return; // Terminate the program
        }
        double secondDouble = scanner.nextDouble();


        double average = (firstDouble + secondDouble) / 2;
        System.out.println("Average: " + average);

	}

}
