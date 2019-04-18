import java.util.Scanner;

public class LocateLargest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Get rows and columns
		System.out.println("Enter the number of rows and columns of the array: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		double[][] ara = new double[num1][num2];

		//Get elements
		System.out.println("Enter the array: ");

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				ara[i][j] = input.nextDouble();
			}
		}
		
		//Call method and print
		int[] result = locateLargest(ara);
		System.out.println("The location of the largest element is at (" + result[0] + ", " + result[1] + ")");
	}

	// method for getting the largest
	public static int[] locateLargest(double[][] a) {
		int[] myAra = { 0, 0 };
		double largestVal = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > largestVal) {
					largestVal = a[i][j];
					myAra[0] = i;
					myAra[1] = j;
				}
			}

		}
		return myAra;
	}
}
