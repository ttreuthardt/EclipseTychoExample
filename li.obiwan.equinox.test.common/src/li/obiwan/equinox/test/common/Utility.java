package li.obiwan.equinox.test.common;

import org.apache.commons.io.FileSystemUtils;

public class Utility {

	public static String getMyName() {
		try {
			FileSystemUtils.freeSpaceKb();			
		} catch(Exception e) {
			
		}
		return "Thomas";
	}

}
