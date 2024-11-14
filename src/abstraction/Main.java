package abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to XXXXX");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of items to buy: ");
		int numItems = scanner.nextInt();

		int costPerItem = 100;
		int totalAmount = numItems * costPerItem;

		Flipkart flipkart = new Flipkart();
		Amazon amazon = new Amazon();
		Myntra myntra = new Myntra();

		System.out.println("Amount to be paid for your purchase is " + totalAmount + " rupees in:");

		System.out.println("- Flipkart: " + (totalAmount - flipkart.getDiscount(totalAmount)));
		System.out.println("- Amazon: " + (totalAmount - amazon.getDiscount(totalAmount)));
		System.out.println("- Myntra: " + (totalAmount - myntra.getDiscount(totalAmount)));

		scanner.close();
	}
	// TODO Auto-generated method stub
}


