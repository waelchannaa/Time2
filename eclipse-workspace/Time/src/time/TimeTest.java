package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {
	

	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds==18305);
	}
	
	@Test
	void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, 
				()->{
					System.out.println();
					Time.getTotalSeconds("10:00");
				}
				);
	}
	

	@Test
	void testGetMilliseconds() {
		int milliseconds = Time.getMilliseconds("10:59:59:005");
		assertTrue("The Milliseconds were not calculated properly", milliseconds==5);
	}
	
	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}

	@ParameterizedTest
	@ValueSource( strings = {"05:03:00", "05:03:59"})
	void testGetTotalMinutes(String candidate) {
		int minutes = Time.getTotalMinutes(candidate);
		assertTrue("The seconds were not calculated properly", minutes==3);
	}

	@ParameterizedTest
	@ValueSource( strings = {"05:00:00", "05:59:59"})
	void testGetTotalHours(String candidate) {
		int hours = Time.getTotalHours(candidate);
		assertTrue("The seconds were not calculated properly", hours==5);
	}

}
