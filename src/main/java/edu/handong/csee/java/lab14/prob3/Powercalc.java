// package name
package edu.handong.csee.java.lab14.prob3;

// Powercalc class
public class Powercalc {
	//default constructor
	public Powercalc() {
		//empty
	}

	// power() method that can throw an Exception
	public long power(int n, int p) throws Exception {

		// if both the n and p values are zero,
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero."); // then throws an exception message that they both should not be zero
		}

		// if either n or p is a negative value 
		else if(n < 0 || p < 0 ) {
			throw new Exception("n or p should not be negative."); // then throws an exception message that n or p should not be a negative value
		}

		return (long)Math.pow(n,p); // returns the value of: n to the power p with typecasted to long type
	}
}
