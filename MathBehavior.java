package chapter2;

public class MathBehavior {

	public static void main(String[] args) {
		
		/* 
		 * In the first print line the numbers are integers and therefore do not use decimals.
		 * The integer variable type will cut off any additional decimals to keep the number whole.
		 * 
		 * In the second print line the ".0" is added to the 5 and therefore the computer knows to
		 * store the result in a double variable type or some other variable type that allows for 
		 * decimals.  It assumes that because the ".0" was added that the result should maintain any
		 * decimal places it may have.*/

	    System.out.println("23/5 is " + 23/5);
	    System.out.println("23/5.0 is " + 23/5.0);
	    
	}

}
