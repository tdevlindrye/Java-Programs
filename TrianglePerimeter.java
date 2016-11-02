import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {

			//create a scanner
			Scanner input = new Scanner(System.in);
			
			//get edge length from user
			System.out.println("Enter the three edge lengths of the triangle: ");
			double edgea = input.nextDouble();
			double edgeb = input.nextDouble();
			double edgec = input.nextDouble();
			
			//compute and print edge lengths if valid
			if (edgea + edgeb > edgec && edgea + edgec > edgeb && edgeb + edgec > edgea)
				System.out.println("The perimeter of the triangle is " + (edgea + edgeb + edgec) + ".");
			
			//print error message if edge lengths are invalid
			else 
				System.out.println("The lengths input are invalid.  Please check them and try again.");
	
		}

}
