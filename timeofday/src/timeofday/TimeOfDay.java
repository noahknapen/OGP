package timeofday;

/**
 * lectures are online
 * Instances of this class store a time of day
 * 
 * @invar The hours are between 0 and 23
 * 		| 0 <= getHours() && getHours() <= 23
 * @invar The minutes are between 0 and 59
 * 		| 0 <= getMinutes() && getMinutes <= 59
 */

public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 24*60 (exclusive)
	 * 		| 0 <= minutesSinceMidnight && minutesSinceMidnight < 24*60
	 */
	
	private int minutesSinceMidnight;
	
	int getHours() {return this.minutesSinceMidnight/60;}		// 'this' in java == 'self' in python
		
	int getMinutes() {return this.minutesSinceMidnight % 60;}	// %60 geeft de rest bij deling door 60
	
	/**
	 * initializes this instance with the given hours and minutes
	 * 
	 */
	
	public TimeOfDay(int hours, int minutes) {		// this is a constructor; it has the same name as the class
		minutesSinceMidnight = hours*60+minutes;	// these arguments should be given when making an object of the class
	}
	
	/**
	  * sets this object's hours
	  * 
	  * @pre The given hours are between 0 and 23
	  * 	| 0 <= hours && hours <= 23
	  * @post This object's hours equal the given hours
	  * 	| getHours() == hours 
	  * @post This object's minutes have remained unchanged
	  * 	| getMinutes() == old(getMinutes())
	 */
	
	void setHours(int hours) {
			minutesSinceMidnight = getMinutes() + hours * 60;
		}
		
	void setMinutes(int minutes) {
			minutesSinceMidnight = getHours() * 60 + minutes;
		}
			// see difference between static and non-static
}
