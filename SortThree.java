import java.util.Scanner;


public class SortThree {

	public static void displaySortedNumbers (double num1, double num2, double num3) {
		
		//set variables
		double highest = 0;
		double middle = 0;
		double lowest = 0;
		
		//assign numbers if first is highest
		if (num1 > num2 && num1 > num3){
			highest = num1;
		if(num2 > num3)
			middle = num2; lowest = num3;
		if(num3 > num2)
			middle = num3; lowest = num2;
			
		}
		
		//assign numbers if second is highest
		if (num2 > num1 && num2 > num3){
			highest = num2;
		if(num1 > num3)
			lowest = num3; middle = num1; 
			System.out.println("poop");
		if(num3 > num1)
			middle = num3; lowest = num1;
			
		}
		
		//assign numbers if third is highest
		if (num3 > num2 && num3 > num1){
			highest = num3;
		if(num2 > num1)
			middle = num2; lowest = num1;
		if(num1 > num2)
			middle = num1; lowest = num2;

		}
		
		//display numbers first in increasing order then in decreasing order without user prompting
		System.out.println("Your numbers in increasing order are: " + lowest + " " + middle + " " + highest);
		System.out.println("Your numbers in decreasing order are: " + highest + " " + middle + " " + lowest);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.println("Please enter your first number: ");
		double first = input.nextDouble();
		
		System.out.println("Please enter your second number: ");
		double second = input.nextDouble();
		
		System.out.println("Please enter your third number: ");
		double third = input.nextDouble();
		
		//use method
		displaySortedNumbers(first, second, third);


	}

}
