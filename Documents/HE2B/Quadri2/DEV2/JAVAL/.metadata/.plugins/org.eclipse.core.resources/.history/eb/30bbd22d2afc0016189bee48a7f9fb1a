package g43194.td03;

import static org.junit.Assert.*;

import org.junit.Test;

public class MomentTest {
	
	Moment moment1 = new Moment(16,26,31);
	Moment moment2 = new Moment(11,34,25);
	Moment moment3 = new Moment(12,00,00);
	Moment moment4 = new Moment(12,00,00);
	Moment moment5 = new Moment();
	
	@Test
	public void testMoment() {
		assertEquals(moment1, moment1);
		assertEquals(moment2, moment2);
	}

	@Test
	public void testGetHeure() {
		assertEquals(moment1.getHeure(), 16);
		assertEquals(moment2.getHeure(), 11);
	}

	@Test
	public void testGetMinute() {
		assertEquals(moment1.getMinute(), 26);
		assertEquals(moment2.getMinute(), 34);
	}

	@Test
	public void testGetSeconde() {
		assertEquals(moment1.getSeconde(), 31);
		assertEquals(moment2.getSeconde(), 25);
	}

	@Test
	public void testSetHeure() {
		moment1.setHeure(12);
		assertEquals(moment1.getHeure(), 12);
		moment1.setHeure(16);
		
	}

	@Test
	public void testSetMinute() {
		moment1.setMinute(12);
		assertEquals(moment1.getMinute(), 12);
		moment1.setMinute(26);
	}

	@Test
	public void testSetSeconde() {
		moment1.setSeconde(12);
		assertEquals(moment1.getSeconde(), 12);
		moment1.setSeconde(31);
	}

	@Test
	public void testToString() {
		assertEquals(moment1.toString(), "16:26:31");
		assertEquals(moment2.toString(), "11:34:25");
	}
	
	public void testCompareto() {
		assertEquals(moment3.compareTo(moment4), 0);
		assertEquals(moment2.compareTo(moment3), -1);
		assertEquals(moment1.compareTo(moment2), 1);
	}

}
