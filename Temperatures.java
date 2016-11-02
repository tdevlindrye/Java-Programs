package chapter2;

import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {
		
		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//get Celsius from user
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		//output conversion in Fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
