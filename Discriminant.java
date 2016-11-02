// I used an assignment I completed from a previous class to help guide me through this one

import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {

			//create a scanner
			Scanner input = new Scanner(System.in);
			
			//get variables
			System.out.println("Enter a, b, c: ");
			double numa = input.nextDouble();
			double numb = input.nextDouble();
			double numc = input.nextDouble();
			
			//calculate discriminates and roots
			double discrim = Math.pow(numb, 2) - 4 * numa * numc;
			double discrim0 = ((-numb) / (2 * numa));
			double root1 = ((-numb + Math.pow(discrim, 0.5)) / (2 * numa));
			double root2 = ((-numb - Math.pow(discrim, 0.5)) / (2 * numa));
			
			//print results
			if (discrim < 0)
				System.out.println("The equation has no real roots.");
			else if (discrim == 0)
				System.out.println("The equation has one root " + ((int)(discrim0*100) / 100.0) + ".");
			else if (discrim > 0)
				System.out.println("The equation has two roots " + ((int)(root1*100) / 100.0) + " and " + ((int)(root2*100) / 100.0) + ".");
		}

	}
