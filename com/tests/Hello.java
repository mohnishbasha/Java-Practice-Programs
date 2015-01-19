package com.tests;

public class Hello {
	String title;
	int value;

	public Hello() {
		this(4);
		title += " World";
		
	}

	public Hello(int value) {
		this.value = value;
		title = "Hello";
		
	}
}
