// I used an assignment I completed from a previous class to help guide me through this one

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
			//create a scanner
			Scanner input = new Scanner(System.in);
			
			//get weapons
			System.out.println("scissor (0), rock (1), paper (2): ");
			double usersnum = input.nextDouble();
			int compnum = (int) (Math.random() * 3);
			
			//generate and print outcome
			if (usersnum == 0 && compnum == 0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			if (usersnum == 1 && compnum == 1)
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			if (usersnum == 2 && compnum == 2)
				System.out.println("The computer is paper. You are paper too. It is a draw.");
			if (usersnum == 0 && compnum == 1)
				System.out.println("You are scissor. The computer is rock. You lost.");
			if (usersnum == 0 && compnum == 2)
				System.out.println("You are scissor. The computer is paper. You won.");
			if (usersnum == 1 && compnum == 0)
				System.out.println("You are rock. The computer is scissor. You won.");
			if (usersnum == 1 && compnum == 2)
				System.out.println("You are rock. The computer is paper. You lost.");
			if (usersnum == 2 && compnum == 0)
				System.out.println("You are paper. The computer is scissor. You lost.");
			if (usersnum == 2 && compnum == 1)
				System.out.println("You are paper. The computer is rock. You won.");
				
		}
	
	}