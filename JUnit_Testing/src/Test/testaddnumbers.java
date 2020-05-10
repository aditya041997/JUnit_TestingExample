package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		TF junit = new TF();
		int result=junit.addnumbers(100,200);
		assertEquals(300,result);
	}

}
