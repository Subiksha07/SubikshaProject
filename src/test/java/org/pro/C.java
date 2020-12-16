package org.pro;

import org.testng.annotations.Test;

public class C {
	
	@Test
	private void testc1() {
		System.out.println("TestC1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testc2() {
		System.out.println("TestC2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testc3() {
		System.out.println("TestC3");
		System.out.println(Thread.currentThread().getId());
	}

	

}
