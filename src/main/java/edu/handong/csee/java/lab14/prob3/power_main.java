// package name
package edu.handong.csee.java.lab14.prob3;

// imports the Scanner class to get inputs
import java.util.Scanner;

// power_main class
public class power_main {

	//main method
	public static void main(String[] args) {
		int n=0,p=0; // initializes the value of variable n and p as default 0
		Scanner input = new Scanner(System.in); // creates the Scanner instance to take in user inputs 
		Powercalc my_calculator = new Powercalc(); // creates instance of Powercalc class

		n = input.nextInt(); // takes in an integer input and sets it to equal to variable n
		p = input.nextInt(); // takes in an integer input and sets it to equal to variable p

		// try block
		try {
			System.out.println(my_calculator.power(n,p)); // prints the message that is returned by calling the power() method
		}
		// catch block
		catch(Exception e) {
			System.out.println(e); // prints the exception that the try block has thrown
		}

	}

}
