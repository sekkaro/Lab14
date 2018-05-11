// package name
package edu.handong.csee.java.lab14.prob1;

// SpeedLimiter class
public class SpeedLimiter {
	private int speedLimit; // variable to store the speed limit
	private int randomNumber; // to store the random speed value

	// empty constructor
	public SpeedLimiter() {
		speedLimit=0; // sets the speed limit value to default
		randomNumber=0; // sets the random speed value to default
	}

	// constructor with 2 parameters
	public SpeedLimiter(int speedLimit, int randomNumber) {
		this.speedLimit = speedLimit; // sets the speed limit as the value gotten from the parameter
		this.randomNumber = randomNumber; // sets the random speed value as the value from the parameter
	}

	// warnSpeedLimit() method
	public void warnSpeedLimit() {
		// try block
		try {
			// if the random speed value is over the speed limit,
			if(randomNumber > speedLimit) {
				throw new Exception("Speed limit " + speedLimit + "km exceeded!" ); // print the message showing the speed limit and that it exceeded the limit

			}

			System.out.println("You are a law abiding citizen!"); // prints the message "You are a law abiding citizen" if the Exception has not been thrown
		}
		// catch block
		catch(Exception e){
			System.out.println(e.getMessage()); // gets the Exception message from the try block and prints that message
			System.out.println("You are being fined."); // prints the message "You are being fined."
		}
		System.out.println("Your current speed: " + randomNumber); // shows the random speed value
	}

}