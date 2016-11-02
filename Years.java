package chapter2;

import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		
		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//get minutes from user
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		//calculate years
		int years = minutes / 525600;
		
		//calculate days
		int days = (minutes % 525600) / 1440;
		
		//return data to user
		System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days");
		
	}

}
