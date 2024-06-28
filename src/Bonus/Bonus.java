package Bonus;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.nextLine();
        }
		double num = scanner.nextDouble();
		
		System.out.println("Input number of digit to round up: ");
		while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.nextLine();
        }
		int digit = scanner.nextInt();
		
		double scale = Math.pow(10, digit);
        double roundedValue = Math.round(num * scale) / scale;
        System.out.println("Rounded Value: " + roundedValue);
		
		scanner.close();
		
	}
}