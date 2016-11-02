// I used an assignment I completed from a previous class to help guide me through this one

public class FiveOrSix {
	
	  public static void main(String[] args) {

		    int count = 1;
		    for (int i = 100; i <= 200; i++)
		    	
		    //determine numbers divisible by 5 or 6
		      if (i % 5 == 0 ^ i % 6 == 0)		    	  
		        System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
	  }

}
