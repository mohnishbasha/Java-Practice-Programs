package com.tests;

public class AccessModifiers {
	public static void main(String[] arg){
		test tobj = new test();
		tobj.testfunc();
		System.out.println(tobj.proPrice);
		
	}
}

class test{
	private int price = 10;
	public int pubPrice = 20;
	protected int proPrice = 30;
	public void testfunc(){
		System.out.println(this.price);
	}	
}




