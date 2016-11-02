//This work is my own, but I did use multiple Google searches to help me figure it out.

import java.util.Scanner;


public class CreditCardValidation {

	//final method to determine validity
    public static boolean isValid(long number) {

        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number)>=13 ) && (getSize(number)<=16 )) {
            return true;
        } 
        else {
            return false;
        }
    }
	
    //adds double all the even entries
    public static int sumOfDoubleEvenPlace(long number) {

        int result = 0;
        long digits = 0;

        while (number > 0) {
            digits = number % 100;
            result += getDigit((int) (digits / 10) * 2);
            number = number / 100;
        }

        return result;
    }
	
    //adds digits together
	public static int getDigit(int number){
		
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}
	
	//adds all the odd entires
    public static int sumOfOddPlace(long number) {
        int result = 0;

        while (number > 0) {
            result += (int) (number % 10);
            number = number / 100;
        }

        return result;
    }
	
    //checks valid prefix
    public static boolean prefixMatched(long number, int d) {

        if ((getPrefix(number, d) == 4)
                || (getPrefix(number, d) == 5)
                || (getPrefix(number, d) == 3)) {

            if (getPrefix(number, d) == 3) {

            } 
            else if (getPrefix(number, d) == 5) {

            } 
            else if (getPrefix(number, d) == 3) {

            }

            return true;

        } 
        else {

            return false;

        }
    }
	
    //gets the size of entry
    public static int getSize(long d) {

        int count = 0;

        while (d > 0) {
            d = d / 10;

            count++;
        }

        return count;

    }
	
    //determines the prefix
    public static long getPrefix(long number, int k) {

        if (getSize(number) < k) {
            return number;
        } 
        else {

            int size = (int) getSize(number);

            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }

            return number;

        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //gets user input
        System.out.print("Enter a credit card number as a long integer: ");
		long usernum = input.nextLong();

		//prints outcome
        if (isValid(usernum) == true) {
            System.out.println(usernum + " is valid. ");
        } 
        else {
            System.out.println(usernum + " is invalid. ");
        }

    }

}
