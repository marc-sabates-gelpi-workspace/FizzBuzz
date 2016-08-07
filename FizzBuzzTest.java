import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void number1() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}
	
	@Test
	public void number2() throws Exception {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	
	@Test
	public void number3() throws Exception {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}
	
	@Test
	public void number4() throws Exception {
		assertEquals("4", FizzBuzz.fizzBuzz(4));
	}
	
	@Test
	public void number5() throws Exception {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}
	
	@Test
	public void number6() throws Exception {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
	}
	
	@Test
	public void number7() throws Exception {
		assertEquals("7", FizzBuzz.fizzBuzz(7));
	}
	
	@Test
	public void number8() throws Exception {
		assertEquals("8", FizzBuzz.fizzBuzz(8));
	}
	
	@Test
	public void number9() throws Exception {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
	}
	
	@Test
	public void number10() throws Exception {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}
	
	@Test
	public void number11() throws Exception {
		assertEquals("11", FizzBuzz.fizzBuzz(11));
	}
	
	@Test
	public void number12() throws Exception {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
	}
	
	@Test
	public void number13() throws Exception {
		assertEquals("13", FizzBuzz.fizzBuzz(13));
	}
	
	@Test
	public void number14() throws Exception {
		assertEquals("14", FizzBuzz.fizzBuzz(14));
	}
	
	@Test
	public void number15() throws Exception {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}

}
