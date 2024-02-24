package org.sam;
import org.testng.annotations.Test;

public class A {
	@Test(priority = -6)
	private void tc4() {
		System.out.println("Test case 4");

	}
	@Test
	private void tc6() {
		System.out.println("Test case 6");

	}
	@Test(priority = 3)
	private void tc1() {
		System.out.println("Test case 1");

	}
	@Test(priority = -1)
	private void tc3() {
		System.out.println("Test case 3");

	}
	@Test(priority = 2)
	private void tc2() {
		System.out.println("Test case 2");

	}
	@Test
	private void tc5() {
		System.out.println("Test case 5");

	}






}
