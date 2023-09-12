package assign01_03;

import java.util.Scanner;

public class foodMenu {

	public static void main(String[] args) {
		 String[] menuItems = {
		            "Dosa", "Samosa", "Idli", "Biryani", "Pizza",
		            "Pasta", "Burger", "Noodles", "Ice Cream", "Generate Bill"
		        };
		        double[] itemPrices = {
		            5.0, 2.0, 3.0, 8.0, 10.0,
		            7.0, 6.0, 5.0, 4.0, 0.0  
		        };

		        int[] quantities = new int[menuItems.length];
		        double totalBill = 0.0;

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Food Menu:");
		        for (int i = 0; i < menuItems.length; i++) {
		            System.out.println((i + 1) + ". " + menuItems[i] + " - Rs" + itemPrices[i]);
		        }

		        while (true) {
		            System.out.print("Enter the item number (or '10' to Generate Bill): ");
		            int choice = scanner.nextInt();

		            if (choice < 1 || choice > menuItems.length) {
		                System.out.println("Invalid choice. Please select a valid item.");
		                continue;
		            }

		            if (choice == 10) {
		                break;
		            }

		            System.out.print("Enter the quantity: ");
		            int quantity = scanner.nextInt();

		            quantities[choice - 1] += quantity;
		            double subtotal = itemPrices[choice - 1] * quantity;
		            totalBill += subtotal;

		            System.out.println("Added " + quantity + " " + menuItems[choice - 1] + "(s) to your order.");
		        }

		        System.out.println("Total Bill: Rs" + totalBill);

	}

}
