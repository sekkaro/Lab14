// package name
package edu.handong.csee.java.lab14.prob6;

// imports Scanner class to read user inputs
import java.util.Scanner;

// Custom_main class
public class Custom_main {
	// main method
	public static void main(String[] args) {
		String name,race; // String variables that stores value of name and race
		int age=0; // initializes the value of age as 0
		Scanner keyboard = new Scanner(System.in); // creates a Scanner class instance to read user inputs 
		CustomID obj = new CustomID(); // creates instance of CustomID class
		boolean repeat = true; // initializes the boolean variable to true
		
		// while repeat is true it will keep the loop
		while(repeat) {
			// try block
			try {
				// if the state of the CustomID class instance is 0,
				if(obj.getState()==0) {
					System.out.print("Enter your name: "); // guides the user to enter their name
					name = keyboard.nextLine(); // store that user inputed name to the name variable 
					obj.set_name(name); // calls the set_name method to set the name of the CustomID class instance
				}
				// if the state of the CustomID class instance is 1
				else if(obj.getState()==1) {
					System.out.print("Enter your age: "); // guides the user to enter their age
					age = keyboard.nextInt(); // store that user inputed name to the age variable
					keyboard.nextLine(); // to prevent the next nextLine() method reading an enter key instead of a value, calls nextLine() again
					obj.set_age(age); // calls the set_age method to set the age of the CustomID class instance
				}
				// if the state of the customID class instance is 2
				else if(obj.getState()==2) {
					System.out.print("Enter your race: "); // guides the user to enter their race
					race = keyboard.nextLine(); // store that user inputed name to the race variable
					obj.set_race(race); // calls the set_race method to set the race of the customID class instance
				}
			}
			// catch block
			catch(Exception e) {
				System.out.println(e.getMessage()); // prints the Exception message thrown from the try block
				continue; // go straight to the starting of the loop once again
			}
		}
	}
}
