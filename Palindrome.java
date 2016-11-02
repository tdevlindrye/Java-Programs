import java.util.Scanner;

public class Palindrome {
	
	//reverse the number
	public static int reverse(int number) {
		
		int reverse = 0;
		
		while (number != 0) {
			
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;
		
	}
	
	//determine if number is a palindrome
	public static boolean isPalindrome(int number) {
		
		boolean isPali = true;
		
		if (number == reverse(number)) {
			isPali = true;
		}
		else if (number != reverse(number)) {
			isPali = false;
		}
		return isPali;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.println("Please enter an integer: ");
		int usernum = input.nextInt();

		//print results
		System.out.println("Is your number is a Palidrome number? " + isPalindrome(usernum));

	}

}
