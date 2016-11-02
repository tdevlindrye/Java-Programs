
public class PentagonalNumbers {

	//calculate Pentagonal Number
	public static int getPentagonalNumber(int n) {
		int pentnum = n * (3 * n - 1) / 2;
		
		return pentnum;
	}
	
	public static void main(String[] args) {
		
		//set counter
		
		//run loop
		int count = 1;
		for(int i = 1; i < 101; i++)
		
		//print chart
        System.out.print((count++ % 10 != 0) ? getPentagonalNumber(i) + " ": getPentagonalNumber(i) + "\n");

	}

}
