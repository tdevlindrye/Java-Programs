public class CancellationError {

	public static void main(String[] args) {
		
		//set left counter
		double left_total = 0;
		
		//calculate left total
		for(double i = 1; i <= 50000; i++){
				left_total += (1/i);
		}
		//print left total
		System.out.println(left_total);
		
		//set right counter
		double right_total = 0;
		
		//calculate right total
		for(double j = 50000; j > 0; j--){
				right_total += (1/j);
		}
		//print right total
		System.out.println(right_total);

	}

}