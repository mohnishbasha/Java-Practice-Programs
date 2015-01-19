package com.tests;

public class XMLMessage  {
	
	String getText() {
		return "<msg>text</msg>";
	}
	

	public static void main(String[] args) {
		System.out.println(new XMLMessage().getText());
		int a=10,b=20;
		swap(a,b);
		System.out.println("A: " +a + " B:" + b);
		Obj testObj = new Obj(10,20);
		swap(testObj);
		System.out.println("A: " +testObj.a + " B:" + testObj.b);
		
		
	}
	
	public static void swap(int a, int b){
		int t =a;
		a=b;
		b=t;
		System.out.println(" Swap:- A: " +a + " B:" + b);
	}
	
	public static void swap(Obj a){
		int t = a.a;
		a.a=a.b;
		a.b=t;
		System.out.println(" Obj Swap:- A: " +a.a + " B:" + a.b);
	}
}

class Obj{
	int a,b;
	public Obj(int a,int b){
		this.a = a;
		this.b = b;
	}
}