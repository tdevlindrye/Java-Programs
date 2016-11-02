import java.util.Scanner;

public class TwoRectangles {

	public static void main(String[] args) {
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//get dimensions of rectangle 1
		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
		double x_r1 = input.nextDouble();
		double y_r1 = input.nextDouble();
		double width_r1 = input.nextDouble();
		double height_r1 = input.nextDouble();
		
		//get dimensions of rectangle 2
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double x_r2 = input.nextDouble();
		double y_r2 = input.nextDouble();
		double width_r2 = input.nextDouble();
		double height_r2 = input.nextDouble();
		
		/* assign the distance between the x and y values between the two rectangles ensuring the 
		 * distance gets recorded as a positive number */
		double x_distance = x_r1 >= x_r2 ? x_r1 - x_r2 : x_r2 - x_r1;
		double y_distance = y_r1 >= y_r2 ? y_r1 - y_r2 : y_r2 - y_r1;
		
		/* use the information for the center of the rectangles, their width and height to determine
		 * if rectangle 2 is inside of, overlapping or entirely outside of rectangle 1 and print the 
		 * results */
		if (x_distance <= (width_r1 - width_r2) / 2 && y_distance <= (height_r1 - height_r2) / 2)
			System.out.println("r2 is inside r1");
		else if (x_distance <= (width_r1 + width_r2) / 2 && y_distance <= (height_r1 + height_r2) / 2)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
			
	}

}
