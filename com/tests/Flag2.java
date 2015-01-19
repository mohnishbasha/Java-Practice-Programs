package com.tests;

public class Flag2{
	private boolean isReady = false;
	
	public void produce(){
		isReady = true;
	
	}
	
	public void consume(){
		while(! isReady){
			try{
				
			}catch(Exception ex){}
		}
		isReady = false;
	}
}