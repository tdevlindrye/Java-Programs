//This code is my own, but I did use code I wrote in a previous class to help with this one.

import java.util.Scanner;

public class SumByColumn {

	  public static void main(String[] args) {
		  
		    Scanner input = new Scanner(System.in);
		    
		    //Get matrix from user
		    System.out.println("Enter a 3 by 4 matrix row by row: ");
		    double[][] matrix = new double[3][4];
		    
		    for (int i = 0; i < 3; i++)
		      for (int j = 0; j < 4; j++)
		        matrix[i][j] = input.nextDouble();

		    //Print sum of each columns
		    System.out.println("Sum of the elements at column 0 is  " 
		    		+ sumColumns(matrix, 0));
		    System.out.println("Sum of the elements at column 1 is  " 
		            + sumColumns(matrix, 1));
		    System.out.println("Sum of the elements at column 2 is  " 
		            + sumColumns(matrix, 2));
		    System.out.println("Sum of the elements at column 3 is  " 
		            + sumColumns(matrix, 3));
		  }
		  
	  		//Method for calculating column sum
		  public static double sumColumns(double[][] matrix, int columnIndex) {
		    double sum = 0;

		    for (int i = 0; i < matrix.length; i++)
		        sum += matrix[i][columnIndex];

		    return sum;
		  }  
		}