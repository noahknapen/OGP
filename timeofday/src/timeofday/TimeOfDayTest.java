package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(0,0);
		assert myTimeOfDay.getHours() == 0;		// getHours is not static
		assert myTimeOfDay.getMinutes() == 0;
		myTimeOfDay.setHours(12);
		myTimeOfDay.setMinutes(45);
		assert myTimeOfDay.getHours() == 12;
		assert myTimeOfDay.getMinutes() == 45;
		//assert myTimeOfDay.minutesSinceMidnight == 0;  //doesn't work because minutesSinceMidnight is private
	}

}
