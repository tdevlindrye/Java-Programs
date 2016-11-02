//This code is my own, but I did use an example from a Google search to help as a guide

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  
		  //Create playing board and variables
		  char[][] board = new char[3][3];
		  char player = 'X';
		  char status;
		  int row, col;
		 
		  //Print board
		  displayBoard(board);
		 
		  //Keep the game going if no winner
		  while ((status = checkBoard(board)) == 'G') {
		 
		   System.out.print("Enter a row (0, 1, or 2) for player " + player
		     + ":");
		   row = input.nextInt();
		 
		   System.out.print("Enter a column (0, 1, or 2) for player " + player
		     + ":");
		   col = input.nextInt();
		 
		   if (board[col][row] != '\u0000') {
		    System.out.println("The row and column is occupied.");
		    continue;
		   } 
		   
		   else {
		    board[col][row] = player;
		    if (player == 'O') {
		     player = 'X';
		    } 
		    
		    else {
		     player = 'O';
		    }
		 
		   }
		   
		   //Print the new board
		   displayBoard(board);
		 
		  }
		   
		  //Outcomes when game is over
		  if(status == 'D')
		  System.out.println("It is a draw.");
		  else
		  System.out.println("The winner is " + status);
		   
		 
		 }
		 
		//Method to see if the game is over
		 public static char checkBoard(char board[][]) {
		  char status = 'D';
		 
		  //See if the board is full
		  outer: for (int i = 0; i < board.length; i++) {
		   for (int j = 0; j < board[0].length; j++) {
		    if (board[i][j] == '\u0000') {
		     status = 'G';
		     break outer;
		    }
		   }
		 
		  }
		 
		  //Column 1
		  if (board[0][0] == board[0][1] && board[0][0] == board[0][2]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  //Column 2
		  if (board[1][0] == board[1][1] && board[1][0] == board[1][2]
		    && board[1][0] != '\u0000') {
		   status = board[1][0];
		  }
		 
		  //Column 3
		  if (board[2][0] == board[2][1] && board[2][0] == board[2][2]
		    && board[2][0] != '\u0000') {
		   status = board[2][0];
		  }
		 
		  //Row 1
		  if (board[0][0] == board[1][0] && board[0][0] == board[2][0]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  //Row 2
		  if (board[0][1] == board[1][1] && board[0][1] == board[2][1]
		    && board[0][1] != '\u0000') {
		   status = board[0][1];
		  }
		 
		  //Row 3
		  if (board[0][2] == board[1][2] && board[0][2] == board[2][2]
		    && board[0][2] != '\u0000') {
		   status = board[0][2];
		  }
		 
		  //Diagonal 1
		  if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  //Diagonal 2
		  if (board[2][0] == board[1][1] && board[2][0] == board[0][2]
		    && board[2][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  return status;
		 
		 }
		 
		 //Method to print the board
		 public static void displayBoard(char board[][]) {
		 
		  for (int i = 0; i < board.length; i++) {
		   for (int j = 0; j < board[1].length; j++) {
		    System.out.print("|" + board[j][i]);
		   }
		 
		   System.out.println("|");
		   System.out.println("_______");
		   
		  }
		 }
		 
		}