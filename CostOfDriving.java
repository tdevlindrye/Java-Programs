package chapter2;

import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {

		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//get the distance
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		//get miles per gallon
		System.out.print("Enter miles per gallon: ");
		double efficiency = input.nextDouble();
		
		//get the price
		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();
		
		//calculate and output the total cost
		double totalcost = distance / efficiency * price;
		System.out.println("The cost of driving is : $" + (int)(totalcost*100) / 100.0);

	}

}
