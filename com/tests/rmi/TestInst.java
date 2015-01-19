package com.tests.rmi;

import java.lang.instrument.Instrumentation;
import java.util.Calendar;

public class TestInst {

	private static Instrumentation inst;

	public static void premain(String options, Instrumentation inst) {
		TestInst.inst = inst;
		System.out.println("options= " + options);
		Class[] loaded = inst.getAllLoadedClasses();
		for (Class clazz : loaded) {
			System.out.println(clazz);
		}
	}

	public static long sizeOf(Object o) {
		//assert inst != null;
		return inst.getObjectSize(o);
	}

	public static void main(String[] args) {
		/*Object testS = new String("012345");
		
		System.out.println("Size of Object: " + sizeOf(testS));
		System.out.println("Size of Object: " + sizeOf(new Object()));
		System.out.println("Size of direct subclass: " + sizeOf(new TestInst()));
		System.out.println("Size of Calendar: "
				+ sizeOf(Calendar.getInstance()));*/
		try{
		
		final Object lock = new Object();
		Thread t1 = new Thread() {

		public void run() {

		System.out.print("a");
		synchronized(lock) { try {
			lock.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		System.out.print("b");

		}

		};
		Thread t2 = new Thread() {

		public void run() {

		System.out.print("c");
		synchronized(lock) { lock.notify(); }

		}

		};
		t1.start();
		t2.start();
		
		TestInst a1 = new TestInst();
		TestInst a2 = new TestInst();
		TestInst a3 = new TestInst();
		//System.out.println(TestInst.)
		int s = 0;
		for(int i=47; i<= 342;i=i+2){
			s=s+i;
		}
		System.out.println(s);
		}
		catch(Exception e){}
		
		

	}
	
}