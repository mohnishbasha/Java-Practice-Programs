package com.tests;

class TestA {
	public void start() {
		System.out.println("TestA");
	}
}

public class TestB extends TestA {
	public void start() {
		System.out.println("TestB");
	}

	public static void main(String[] args) {
		((TestA) new TestB()).start();
		TestA as = new TestB();
		as.start();
		//TestB ab = (TestB) new TestA();
		//ab.start();
	}
}
