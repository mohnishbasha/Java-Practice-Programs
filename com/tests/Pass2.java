package com.tests;

public class Pass2 {
	private static int x ;
	public Pass2(){
	System.out.print(" main x = " + x);
	}
	public static void main(String[] args) {
		
		
		new Pass2();
		
	}

	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
}