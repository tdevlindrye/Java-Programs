package chapter2;

import java.util.Scanner;

public class FutureInvestment {

	public static void main(String[] args) {
		
		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//get initial investment
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		
		//get interest rate
		System.out.print("Enter annual interest rate in percentage: ");
		double rate = input.nextDouble();
		
		//get number of years
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		//calculate and output final value
		double value = amount * Math.pow((1 + ((rate*.01)/12)), (years*12));
		System.out.println("Accumulated value is $" + (int)(value*100) / 100.0);

	}

}
