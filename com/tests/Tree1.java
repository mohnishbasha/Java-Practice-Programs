package com.tests;

 
 interface Status {
	 public final static int MY_VALUE = 10;
	 public abstract  int f();
}


class Plant {
	private String name;
	
	public Plant(){this("test");}

	public Plant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class Tree1 extends Plant {
	
	public Tree1(String name){
		super(name);
	}
	public void growFruit() {
	}

	public void dropLeaves() {
	}
}
