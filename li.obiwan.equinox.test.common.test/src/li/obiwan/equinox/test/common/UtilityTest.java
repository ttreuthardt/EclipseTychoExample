package li.obiwan.equinox.test.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilityTest {

	@Test
	public void testGetMyName() {
		assertEquals("Thomas",Utility.getMyName());
	}

}
