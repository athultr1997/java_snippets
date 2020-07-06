package classes_intro;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDog {	
	@Test
	public void testConstructor() {
		Dog bruno = new Dog("Bruno", 2, "Dobberman");
		assertEquals("Bruno", bruno.getName());
		assertTrue("Error, age is not set using constructor.", 2 == bruno.getAge());
		assertEquals("Dobberman", bruno.getBreed());
	}
}