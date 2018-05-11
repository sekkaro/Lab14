// package name
package edu.handong.csee.java.lab14.prob4;

// imports the Scanner class to read user inputs
import java.util.Scanner;

// Boundary class
public class Boundary {
	private int[] intArray = new int[5]; // integer array with size of 5
	private int i=0,number=0; // initializes the value of i and number to 0  
	Scanner input = new Scanner(System.in); // creates the instance of Scanner class to take in user inputs

	// empty constructor
	public Boundary() {
		// empty
	}

	// takeInputs() method
	public void takeInputs(){
		// infinite loop since the statement holds true
		while(true){
			// try block
			try{
				System.out.print("Enter an integer: "); // prints the message to guide the user to type an integer value
				number = input.nextInt(); // read the integer input of the user and store it in the number variable 
				intArray[i]= number; // store that number into the integer array
				System.out.println("arr["+ i + "] <- " + number); // print the message to show what index of array stores what value
				i++; // increments the value of i to keep storing next element to the next index
			}
			// catch block with index out of bounds exception
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array Index access!"); // prints the message "Invalid array Index access"
				break; //break out from the loop
			}
		}

	}
}
