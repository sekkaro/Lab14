// package name
package edu.handong.csee.java.lab14.prob5;

// MyException class that inherits from the Exception class
public class MyException extends Exception {
	private String message=null; // message string variable initalized as a null value

	// empty constructor
	public MyException() {
		super(); // calls the empty constructor of its superclass: Exception 
	}

	// constructor with String parameter passed on
	public MyException(String message) {
		super(message); // calls the constructor of its superclass: Exception while sending the message gotten as the parameter
		this.message = message; // sets the value of message to the parameter passed on
	}

	// constructor with a parameter as an object that can be thrown
	public MyException(Throwable object) {
		super(object); // calls the constructor of its superclass: Exception while sending the object as the parameter
	}

	// overridden toString() method
	@Override
	public String toString(){
		return message; // returns the message
	}
}
