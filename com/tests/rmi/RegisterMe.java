package com.tests.rmi;

import java.applet.Applet;
import java.awt.SystemColor;
import java.lang.instrument.Instrumentation;
import java.rmi.Naming;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class RegisterMe {
	
	/* -Djava.rmi.server.codebase=file:C:/Users/mohnish/workspace/JavaTests/bin/ */
	
	static void test(){}
	private static Instrumentation inst;
	
	public static void main(String arg[]){
		try{//
		/*(	AddServer m = new AddServer();
			System.out.println("Registering.....");
			Naming.rebind("add",m);
			System.out.println("Server Started .....");
			JPanel jp; */
			//System.ge
			int x= -1;
			x = x >>> 5;
			System.out.println(x);
			
			
			Locale listOfLocales[];
			AddInterface aif = new AddServer();
			
			if(aif instanceof Object){}
			//listOfLocales = System.out.getClass();
			//DateFormat.
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
