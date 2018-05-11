// package name
package edu.handong.csee.java.lab14.prob5;

// imports the Scanner class to read user inputs 
import java.util.Scanner;

// My_main class
public class My_main {
	
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // calls the instance of Scanner class to read user inputs
		String message; // message defined as String type
		
		// try block
		try {
		message = input.nextLine(); // gets the user input in the form of a line and store it into message variable
		MyException exception = new MyException(message); // creates the MyException class instance
		myTest(message); // calls the static method myTest()
		}
		// catch block
		catch(MyException mae) {
			System.out.println("Inside catch block: " + mae); // prints the out the message along with the Exception thrown from the try block
		}

	}
	
	// myTest static method that can throw MyException
	static void myTest(String message) throws MyException {
		// if the message passed on (as parameter) was "null",
		if(message.equals("null")) {
			throw new MyException("String val is null"); // then throw a MyException "String val is null"
		}
		// or else
		else {
			System.out.println("String val is " + message); // print the value of message
		}
	}

}
