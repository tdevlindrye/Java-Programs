import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    
	    //Get number of students
	    System.out.println("Enter the number of students: ");
	    int usernum = input.nextInt();
	    
	    //Get list from user
	    double[] myList = new double[usernum];
	    System.out.print("Enter " + usernum + " scores: ");
	    
	    for (int i = 0; i < myList.length; i++) {
		      myList[i] = input.nextDouble();
		    }

	}

}
