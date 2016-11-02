
public class EightQueens {

	  public static void main(String[] args) {

		  	//Create array
		    int[] queens = new int[8];
		    for (int i = 0; i < 8; i++)
		      queens[i] = -1; 
		    
		    //Initialize queens
		    queens[0] = 0;

		    //Loop to place the queens
		    int j = 1;
		    while (j >= 0 && j <= 7) {
		      int k = findPosition(j, queens);
		      if (k < 0) {
		        queens[j] = -1;
		        j--;
		      } else {
		        queens[j] = k;
		        j++;
		      }
		    }

		    printResult(queens);
		  }
	  		
	  	//Method to determine positions
		  public static int findPosition(int j, int[] queens) {
		    int start = queens[j] == -1 ? 0 : queens[j] + 1;

		    for (int k = start; k < 8; k++) {
		      if (isValid(j, k, queens))
		        return k;
		    }

		    return -1;
		  }

		  // Return true if a queen can be placed there
		  public static boolean isValid(int j, int k, int queens[]) {
		    // See if position is possible
		    for (int i = 0; i < j; i++)
		      if (queens[i] == k)
		        return false;

		    // Check diagnol
		    for (int row = j - 1, column = k - 1; row >= 0 && column >= 0; row--, column--)
		      if (queens[row] == column)
		        return false;

		    // Check diagnol
		    for (int row = j - 1, column = k + 1; row >= 0 && column <= 7; row--, column++)
		      if (queens[row] == column)
		        return false;

		    return true;
		  }

		  //Print the board
		  public static void printResult(int[] queens) {
		    for (int i = 0; i < 8; i++)
		      System.out.println(i + ", " + queens[i]);
		    System.out.println();

		    // Display output
		    for (int i = 0; i < 8; i++) {
		      for (int k = 0; k < queens[i]; k++)
		        System.out.print("| ");
		      System.out.print("|Q|");
		      for (int k = queens[i] + 1; k < 8; k++)
		        System.out.print(" |");
		      System.out.println();
		    }
		  }
		}