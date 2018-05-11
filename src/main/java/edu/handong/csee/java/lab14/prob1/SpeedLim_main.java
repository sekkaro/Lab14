// package name
package edu.handong.csee.java.lab14.prob1;

// import scanner class to get user inputs
import java.util.Scanner;

// SpeedLim_main class
public class SpeedLim_main {
	
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // crates scanner instance
		int randomNumber = (int)(Math.random()*101); // stores random integer value from 0 to 100 
		
		System.out.print("Set the speed limit, officer: "); // prints out message to guide the user to type the speed limit
		SpeedLimiter speedLimit = new SpeedLimiter(input.nextInt(),randomNumber); // using the user input, create a SpeedLimiter instance 
		speedLimit.warnSpeedLimit(); // calls warnSpeedLimit() method of SpeedLimiter instance
		
	}

}
