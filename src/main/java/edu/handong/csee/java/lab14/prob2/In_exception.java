// package name
package edu.handong.csee.java.lab14.prob2;

// imports the whole java.util class
import java.util.*;

// In_exception class
public class In_exception {
	private int x,y; // x and y values in variables
	Scanner input = new Scanner(System.in); // creates Scanner class instance to get user values

	// empty constructor
	public In_exception() {
		x=0; // sets the value of x as default 0
		y=0; // sets the value of y as default 0
	}

	// takeInput() method
	public void takeInput() {
		System.out.print("x: "); // guides the user to enter the value of x
		x = input.nextInt(); // stores that value of x into the variable
		System.out.print("y: "); // guides the user to enter the value of y
		y = input.nextInt(); // stores that value of y into the variable
	}

	// errorDetection() method
	public void errorDetection() {
		// try block
		try {
			takeInput(); //calls the takeInput() method to take inputs from the user
			System.out.println(x/y); // prints the value of the result of  x/y
		}
		// catch block with arithmetic Exception 
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // prints the message along with the Exception thrown/detected from the try block
		}
		// catch block with input mismatch exception
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException"); // prints the message that its an Input Mismatch exception
		}
		// catch block
		catch(Exception e) {
			System.out.println("Other exception has occured: " + e.getMessage()); // prints the message along with the Exception thrown/detected from the try block
		} 
	}
}
