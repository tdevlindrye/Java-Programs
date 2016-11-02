//This code is my own, but I did use the additional resources from the textbook as a guide.

import java.util.Scanner;

public class ConnectFour {

	  public static void main(String[] args) {
		    char[][] board = new char[6][7];

		    //Print the board
		    displayBoard(board);

		    while (true) {
		      //Get the first player's move
		      makeAMove('R', board);
		      
		      //Print board and test for game conclusion
		      displayBoard(board);
		      if (playerWon(board)) {
		        System.out.println("The red player won");
		        System.exit(1);
		      }
		      else if (isDraw(board)) {
		        System.out.println("No winner");
		        System.exit(2);
		      }

		      
		      //Get the second player's move
		      makeAMove('Y', board);
		      
		      //Print board and test for game conclusion
		      displayBoard(board);

		      if (playerWon(board)) {
		        System.out.println("The yellow player won");
		        System.exit(3);
		      }
		      else if (isDraw(board)) {
		        System.out.println("No winner");
		        System.exit(4);
		      }
		    }
		  }

	  		//Method for making a move
		  public static void makeAMove(char player, char[][] board) { 
		    Scanner input = new Scanner(System.in);
		    
		    boolean done = false;
		    
		    //Input disk unless the column is full
		    do {
		      System.out.print("Drop a " + (player == 'R' ? "red" : "yellow") + " disk at column (0-6): ");
		      int column = input.nextInt();
		      
		      if (inputDisk(board, column, player)) { 
		        done = true;
		      }
		      else
		        System.out.println("This column is full. Try a different column");
		    }
		    while (!done);
		  }
		  
		  //Method for inputing a disk if the column is not full
		  static boolean inputDisk(char[][] board, int column, char player) {
		    for (int i = 0; i < board.length; i++) {
		      if (board[i][column] == '\u0000') {
		        board[i][column] = player; 
		        return true;
		      }
		    }
		    
		    return false;
		  }
		  
		  //Method for displaying the board
		  static void displayBoard(char[][] board) {
		    for (int i = board.length - 1; i >= 0; i--) {
		      System.out.print("|");
		      for (int j = 0; j < board[i].length; j++)
		        System.out.print(board[i][j] != '\u0000' ?  board[i][j] + "|": " |");
		      System.out.println();
		    }
		    System.out.println("-------------------");
		  }

		  //Method to check if the player won
		  public static boolean playerWon(char[][] board) {
		    return isConsecutiveFour(board);
		  }

		  //Method to detect a draw
		  public static boolean isDraw(char[][] board) {
		    for (int i = 0; i < board.length; i++)
		      for (int j = 0; j < board[i].length; j++)
		        if (board[i][j] == '\u0000') return false;

		    return true;
		  }
		  
		  //Method to detect four in a row
		  public static boolean isConsecutiveFour(char[][] values) {
		    int rows = values.length;
		    int columns = values[0].length;

		    //Check the rows
		    for (int i = 0; i < rows; i++) {
		      if (isConsecutiveFour(values[i]))
		        return true;
		    }

		    //Check the columns
		    for (int j = 0; j < columns; j++) {
		      char[] column = new char[rows];
		      for (int i = 0; i < rows; i++)
		        column[i] = values[i][j];
		      
		      if (isConsecutiveFour(column))
		        return true;
		    }
		        
		    //Check diagonal  
		    for (int i = 0; i < rows - 3; i++) {
		      int elementsInDiagonal 
		        = Math.min(rows - i, columns);     
		      char[] diagonal = new char[elementsInDiagonal];
		      for (int k = 0; k < elementsInDiagonal; k++)
		        diagonal[k] = values[k + i][k];
		      
		      if (isConsecutiveFour(diagonal))
		        return true;
		    }
		    
		    //Check next diagonal
		    for (int j = 1; j < columns - 3; j++) {
		      int elementsInDiagonal 
		        = Math.min(columns - j, rows);     
		      char[] diagonal = new char[elementsInDiagonal];
		      for (int k = 0; k < elementsInDiagonal; k++)
		        diagonal[k] = values[k][k + j];
		      
		      if (isConsecutiveFour(diagonal))
		        return true;
		    }

		    //Check next diagonal
		    for (int j = 3; j < columns; j++) {
		      int elementsInDiagonal 
		        = Math.min(j + 1, rows);     
		      char[] diagonal = new char[elementsInDiagonal];
		      
		      for (int k = 0; k < elementsInDiagonal; k++)
		        diagonal[k] = values[k][j - k];
		      
		      if (isConsecutiveFour(diagonal))
		        return true;
		    }
		    
		    //Check next diagonal
		    for (int i = 1; i < rows - 3; i++) {
		      int elementsInDiagonal 
		        = Math.min(rows - i, columns);     
		      char[] diagonal = new char[elementsInDiagonal];
		    
		      for (int k = 0; k < elementsInDiagonal; k++)
		        diagonal[k] = values[k + i][columns - k - 1];
		    
		      if (isConsecutiveFour(diagonal))
		        return true;
		    }
		    
		    return false; 
		  }
		  
		  //Method for checking if four in a row match
		  public static boolean isConsecutiveFour(char[] values) {    
		    for (int i = 0; i < values.length - 3; i++) {
		      boolean isEqual = true;        
		      for (int j = i; j < i + 3; j++) {
		        if (values[j] == '\u0000' || values[j] != values[j + 1]) {
		          isEqual = false;
		          break;
		        }
		      }
		     
		      if (isEqual) return true;
		    }
		    
		    return false;
		  }
		}
