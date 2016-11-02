import java.util.Scanner;

public class BubbleSort {

	  public static void main (String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    //Get list from user
		    double[] myList = new double[10];
		    System.out.print("Please input 10 numbers: ");

		    //Input each element
		    for (int i = 0; i < myList.length; i++) {
		      myList[i] = input.nextDouble();
		    }
		    
		    //Apply method
		    bubbleSort(myList);

		    //Print the list
		    System.out.println("The list from lowest to largest is: ");
		    printList(myList);
		  }

	  	  //Method for printing
		  static void printList(double[] list) {
		    for (int i = 0; i < list.length; i++)
		      System.out.println(list[i]);
		  }

		  //Method for sorting
		  static void bubbleSort(double[] list) {
		    boolean changed = true;
		    do {
		      changed = false;
		      for (int j = 0; j < list.length - 1; j++)
		        if (list[j] > list[j+1]) {
		          double temp = list[j];
		          list[j] = list[j + 1];
		          list[j + 1] = temp;
		          changed = true;
		        }
		    } while (changed);
		  }
		}