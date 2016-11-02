import java.util.Scanner;

public class CompareCosts {

	public static void main(String[] args) {
		
			//create a scanner
			Scanner input = new Scanner(System.in);
			
			//get and calculate values for package 1
			System.out.print("Enter weight and price for package 1: ");
			double weight_p1 = input.nextDouble();
			double price_p1 = input.nextDouble();
			double cost_p1 = price_p1 / weight_p1;
			
			//get and calculate values for package 2
			System.out.print("Enter weight and price for package 2: ");
			double weight_p2 = input.nextDouble();
			double price_p2 = input.nextDouble();
			double cost_p2 = price_p2 / weight_p2;
			
			//determine which one has the better price and print the results
			if (cost_p1 < cost_p2)
				System.out.println("Package 1 has a better price.");
			else if (cost_p2 < cost_p1)
				System.out.println("Package 2 has a better price.");
			else
				System.out.println("They both have the same price.");

	}

}
