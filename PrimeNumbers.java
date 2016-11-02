public class PrimeNumbers {

	public static void main(String[] args) {
		
		//set variables
		int count = 1;
		int num = 2;
		boolean prime = true;
		
		System.out.println("The prime numbers from 2 to 1000 are: \n");
		
		//set limit
		while (num <= 1000) {
			prime = true;
			
			//test for primeness
			for (int divisor = 2; divisor <= num / 2; divisor++) {
				if (num % divisor == 0) {
					prime = false;
					break;
				}
			}
			
			//print if prime
			if (prime) {
				if (count % 8 == 0) {
					System.out.println(num);
				}
				else System.out.print(num + " ");
				
				count++;
			}
			num++;
		}

	}

}
