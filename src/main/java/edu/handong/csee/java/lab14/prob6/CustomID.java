// package name
package edu.handong.csee.java.lab14.prob6;

// CustomID class
public class CustomID {
	private String[] races = new String[] {"Vulcans","Romulan","Klingons"}; // race String array initialized to 3 races
	private String name= ""; // initializes the name as an empty string
	private int age = 0; // initializes the age as 0
	private String race =""; // initializes the race as an empty string
	private int state = 0; // initializes the state as 0
	
	// set_name method that can throw Exception
	public void set_name(String str)throws Exception {
		// if the length of the string passed as parameter is less than 5
		if(str.length()<5) {
			state = 0; // set the value of state to zero
			throw new Exception("Your name is short! Try again!"); // throw an Exception message "Your name is short ! Try again!"
		}
		
		// else
		else {
			this.name = str; // set the name as the string gotten from the parameter
			System.out.println("Name is valid"); // prints out the message that the name is valid
			System.out.println("Name: " + this.name); // prints out value of name
			state++; // increments the value of state
		}
	}
	
	// set_age method that can throw Exception
	public void set_age(int num) throws Exception{
		// if the value of the parameter passed(num variable) is under 18
		if(num<18) {
			state = 1; // set the state to 1 to ask the name once again later
			throw new Exception("You are too young! Try again!"); // throws an Exception message "You are too young! Try again!" 
		}
		// or else
		else {
			this.age = num; // set the age as the number given
			System.out.println("Age is valid"); // prints that the age is valid
			System.out.println("Age: " + this.age); // prints the value of age
			state++; // increments the value of state
		}
	}
	
	// set_race method that can throw Exception
	public void set_race(String race) throws Exception{
		// for loop until the length of the String array: race 
		for(int i = 0 ; i < races.length ; i++) {
			// if at least one of the particular race equals to the race passed on from the parameter,
			if(races[i].equals(race)) {
				this.race = races[i]; // set the value of race to that particular race
				System.out.println("Race is valid"); // prints the message saying that the race is valid
				System.out.println("Race: " + races[i]); // prints the value of race
				state = 0; // sets the value of state to 0 to keep the loop going and ask the user
				return; // returns to Custom_main since race is valid
			}
		}
		state = 2; // sets the value of state to 2
		throw new Exception("Human! Try again."); // prints the message to try again
	}
	
	// getState() method
	public int getState() {
		return state; //returns the state value
	}
}
