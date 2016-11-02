//This code is my own, but I did use an example from a Google search to help as a guide

import java.util.Scanner;

public class LatinSquares {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
	       
		    //Get size of square from user
	        System.out.print("Enter number n: ");
	        int usernum = input.nextInt();
	       
	        System.out.println("Enter " + usernum + " rows of letters separated by spaces: ");
	        String n = input.nextLine();
	        
	        //Create memory for square
	        char[][] letterSquare = new char[usernum][usernum];
	        
	        //Create loop to fill square
	        for(int i = 0; i < usernum; i++) {
	            String row = input.nextLine();
	            if(validLetters(row, usernum))
	                letterSquare[i] = getLetters(row, usernum);
	            
	            //Error if letter input is out of range
	            else {
	                System.out.println("Wrong input: the letters must be from A to " + (char)(usernum + 64));
	                break;
	            }
	            
	            //Print status of Latin square
	            if(i == usernum - 1)
	                System.out.println("The input array is " + (isLatinSquare(letterSquare) ? "" : "not " )
	                        + "a Latin square");
	        }
		  }
	  		//Method to input letters
		     public static char[] getLetters(String row, int length) {
		         char[] letters = new char[length];
		         Scanner newchar = new Scanner(row);
		         for(int i = 0; i < length; i++) {
		             char c = newchar.next().charAt(0);
		             letters[i] = c;
		         }
		         return letters;
		     }
		     //Method to determine if square is Latin
		     public static boolean isLatinSquare(char[][] grid) {
		         for(int i = 0; i < grid.length; i++) {
		             if(repeatChars(grid[i]))
		                 return false;
		         }		        
		         char[] col = new char[grid.length];
		         for(int i = 0; i < grid.length; i++) {
		             for(int j = 0; j < grid[i].length; j++) {
		                 col[j] = grid[j][i];
		             }
		             if(repeatChars(col))
		                 return false;
		         }
		         return true;
		     }
		    //Method to detect duplicate characters
		     public static boolean repeatChars(char[] c) {
		    	 
		         for(int i = 0; i < c.length - 1; i++) {
		             for(int j = i + 1; j < c.length; j++) {
		                 if(c[i] == c[j])
		                     return true;
		             }
		         }
		         return false;
		     }
		     //Method to detect if letters are valid
		     public static boolean validLetters(String row, int usernum) {
		         
		         Scanner newchar = new Scanner(row);
		         int letterLimit = 64 + usernum;
		         for(int i = 0; i < usernum; i++) {
		             int charInt = (int)(newchar.next().charAt(0));
		             if(charInt > letterLimit)
		                 return false;
		         }
		         return true;
		     }
	}