package com.tests;

import java.util.ArrayList;
import java.util.List;

public class NameList {
	private List names = new ArrayList();
	
	public synchronized void add(String name){
		names.add(name);
	}
	
	public synchronized void printAll(){
		for(int i=0; i< names.size();i++){
			System.out.print(names.get(i));
		}
	}
	
	public static void main(String args[]){
		//ItemTest aso = new ItemTest();
	//	aso.
		final NameList s1 = new NameList();
		for(int i=0; i<2; i++){
			new Thread(){
				public void run(){
					s1.add("A");
					s1.add("B");
					s1.add("C");
					s1.printAll();
				}
			}.start();
		}
	}
	
	

}
