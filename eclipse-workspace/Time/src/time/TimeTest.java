package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testGetTotalSecondsGood() {
		
		int seconds = 	Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", 
			seconds==18305);
	}

	@Test
	void testGetTotalSecondsBad() {
		assertThrows(
				StringIndexOutOfBoundsException.class,
				()->{Time.getTotalSeconds("10:00");});
	}

	@Test
	void testGetTotalSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}
	
	
	
}
