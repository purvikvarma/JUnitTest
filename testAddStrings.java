package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		Object junitstring;
		String result = jUnitFunctions.AddStrings("capstone", "project");
		assertEquals("capstoneproject", result);
		
		
		
	}

}
