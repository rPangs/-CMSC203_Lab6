import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook firstBook = new GradeBook(5);
	GradeBook secondBook = new GradeBook(5);
	
	firstBook.addScore(24);
	firstBook.addScore(76);
	
	secondBook.addScore(98);
	secondBook.addScore(68);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		
		firstBook = null;
		secondBook = null;
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(firstBook.toString().equals(“24.0 76.0 ”));
		assertTrue(secondBook.toString().equals(“98.0 68.0 ”));

		
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		
		assertEquals(100, firstBook.sum(), .0001);
		assertEquals(166, secondBook.sum(), .0001);
		
		fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		
		assertEquals(24, firstBook.minimum(), .001);
		assertEquals(68, secondBook.minimum(), .001);
		fail("Not yet implemented");
	}
	
	/**
	 * I dont understand what task 4 wants me to do?
	 */
	@Test
	void testFinalScore() {
		
		//firstBook.finalScore();
		
		fail("Not yet implemented");
	}

}
