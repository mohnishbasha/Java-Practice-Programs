package com.tests.rmi;

import java.rmi.Naming;
import java.util.LinkedList;
import java.util.List;

public class AddClient {
	
	public AddClient(){}
	
	
	// -Djava.security.policy=client.policy
	
	
	public static void main(String args[]) {
		try{
			LinkedList a = new LinkedList();
			
			
		
			
			int num1 = Integer.parseInt(args[0]);
			int num = Integer.parseInt(args[1]);
			//AddInterface a = (AddInterface)Naming.lookup("rmi://localhost/add");
			//int ans = a.addMe(num1, num2);
			//System.out.println("Addition of 2 numbers is: " + ans);
			
		}catch(Exception e){ e.printStackTrace(); }
	}

}
