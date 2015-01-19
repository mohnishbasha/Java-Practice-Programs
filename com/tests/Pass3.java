package com.tests;

public class Pass3 {
	public static void main(String[] args) {
		int x = 6;
		Pass3 p = new Pass3();
		p.doStuff(x);
		System.out.print(" main x = " + x);
	}

	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
	
}