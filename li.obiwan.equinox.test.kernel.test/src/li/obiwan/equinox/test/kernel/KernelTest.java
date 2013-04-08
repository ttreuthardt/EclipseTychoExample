package li.obiwan.equinox.test.kernel;

import static org.junit.Assert.*;

import org.junit.Test;

public class KernelTest {

	@Test
	public void testGetName() {
		Kernel k = new Kernel();
		
		assertEquals("Thomas", k.getName());
		
		
	}

}
