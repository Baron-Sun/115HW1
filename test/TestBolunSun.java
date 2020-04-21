
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestBolunSun {
	BolunSun b = new BolunSun();
	
	@Test
	void test1() {
		String result = b.getFullName();
		Assertions.assertEquals("Bolun Sun",result);
	}
	
	@Test
	void test2() {
		String result = b.getFirstName();
		Assertions.assertEquals("Bolun",result);
	}
	
	@Test
	void test3() {
		String result = b.getLastName();
		Assertions.assertEquals("Sun",result);
	}
	
	@Test
	void test4() {
		String result = b.getUCInetID();
		Assertions.assertEquals("boluns",result);
	}
	
	@Test
	void test5() {
		assertEquals(b.getStudentNumber(),52332355);
	}
	
	@Test
	void test6() {
		String result = b.getRotatedFullName(2);
		Assertions.assertEquals("lun SunBo",result);
	}
	
	@Test
	void test7() {
		String result = b.getRotatedFullName(-5);
		Assertions.assertEquals("n SunBolu",result);
	}

}

