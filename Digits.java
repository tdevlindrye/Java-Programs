package chapter2;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//get user number
		System.out.print("Enter a number between 0 and 1000: ");
		int usernum = input.nextInt();
		
		//if usernum is valid
		if (usernum < 1000 && usernum > 0) {
			
		//extract digits
		int digit1 = usernum % 10;
		int digit2 = usernum / 10 % 10;
		int digit3 = usernum / 100 % 10;
		
		//print sum of digits
		System.out.println("The sum of the digits is " + (digit1 + digit2 + digit3));
		
		}
		
		//if usernum is invalid
		else {
			System.out.println("Error: The number you entered is not between 0 and 1000.");
		}
		
	}

}
