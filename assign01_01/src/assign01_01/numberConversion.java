package assign01_01;

import java.util.Scanner;

public class numberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Convert and print binary, octal, and hexadecimal representations
        String binaryNum = Integer.toBinaryString(num);
        String octalNum = Integer.toOctalString(num);
        String hexadecimalNum = Integer.toHexString(num);

        System.out.println("Binary: " + binaryNum);
        System.out.println("Octal: " + octalNum);
        System.out.println("Hexadecimal: " + hexadecimalNum);
    
	}

}
