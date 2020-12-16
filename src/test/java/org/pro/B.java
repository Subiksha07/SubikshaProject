package org.pro;

import org.testng.annotations.Test;

public class B {
	
	@Test
	private void testb1() {
		System.out.println("TestB1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testb2() {
		System.out.println("TestB2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testb3() {
		System.out.println("TestB3");
		System.out.println(Thread.currentThread().getId());
	}

	

}
