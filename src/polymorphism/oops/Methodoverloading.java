package polymorphism.oops;

import java.util.Scanner;

public class Methodoverloading {
	public static int add(int a, int b) {
		return a + b;
	}


	public static String concatenate(String s1, String s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 'i' for integer operations");
		System.out.println("Enter 's' for string operations");
        System.out.println("Enter i or s:");

		char option = sc.next().charAt(0);


		if (option == 'i') {
			System.out.println("Enter two numbers to add:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int sum = add(num1, num2);
			System.out.println("Sum: " + sum);

		} else if (option == 's') {
			System.out.print("Enter two strings to concatenate: ");
			String str1 = sc.next();
			String str2 = sc.next();

			String result = concatenate(str1, str2);
			System.out.println("Concatenated string: " + result);

		} else {
			System.out.println("Invalid choice.");
		}

		sc.close();
	}
}

