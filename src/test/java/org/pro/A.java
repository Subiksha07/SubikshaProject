package org.pro;

import org.testng.annotations.Test;

public class A {
	
	@Test
	private void testa1() {
		System.out.println("TestA1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testa2() {
		System.out.println("TestA2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testa3() {
		System.out.println("TestA3");
		System.out.println(Thread.currentThread().getId());
	}
	
}
