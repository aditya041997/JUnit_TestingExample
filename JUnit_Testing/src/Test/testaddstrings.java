package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		TF junitstring =new TF();
		String result=junitstring.addstring("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
