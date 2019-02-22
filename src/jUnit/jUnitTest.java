package jUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class jUnitTest {

	private int value1;
	private int value2;
	
	@BeforeEach
	void setUp() throws Exception {
		value1 = -3;
		value2 = 5;
	}

	@AfterEach
	void tearDown() throws Exception {
		value1 = 0;
		value2 = 0;
	}
	
	@Test
	void testAdd() {
		int total = 5;
		int sum = jUnit.add(value1, value2);
		assertNotSame(sum, total);
	}
	
	@Test
	void testSub() {
		int total = -8;
		int answer = jUnit.sub(value1, value2);
		assertEquals(answer, total);
	}
	
	@Test
	void testSame() {
		jUnit j1 = new jUnit(value1, value2);
		jUnit j2 = j1;
		assertSame(j1, j2);
	}
	
	@Test
	void testArrayEquals() {
		Integer[] list1 = {value1, value2};
		Integer[] list2 = {value1, value2};
		assertArrayEquals(list1, list2);
	}
	
	@Test
    void firstIsGreaterTest(){
		boolean answer = jUnit.firstIsGreater(value1, value2);
        assertFalse(answer);
    }
	
	@Test
    void firstIsGreaterTest2(){
		boolean answer = jUnit.firstIsGreater(value2, value1);
        assertTrue(answer);
    }
	
	@Test
	void testNull() {
		Integer[] list = {value1, value2, null};
		assertNull(list[2]);
	}
	
	@Test
	void testNotNull() {
		Integer[] list = {value1, value2, null};
		assertNotNull(list[1]);
	}
	
	@Test
	void testAssertThat() {
		 assertThat(value1,is(equalTo(-3)));
	}

}
