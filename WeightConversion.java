// I used an assignment I completed from a previous class to help guide me through this one

public class WeightConversion {

	public static void main(String[] args) {
		
		//print header
	    System.out.println("Kilograms\tPounds");

	    //use while loop
	    int kilos = 1; 
	    while (kilos <= 199) {
	      System.out.println(kilos + "\t\t" + (double)((int)kilos * 22)/10);
	      kilos++;
	    }

	}

}
