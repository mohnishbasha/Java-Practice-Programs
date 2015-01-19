package org.algorithms;

class SingletonClass {

	private static SingletonClass singletonObject;
	/** A private Constructor prevents any other class from instantiating. */
	private SingletonClass() {
		//	 Optional Code
	}
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class SingletonObjectDemo {

	public static void main(String args[]) {
		//		SingletonClass obj = new SingletonClass();                   //Compilation error not allowed
		SingletonClass obj = SingletonClass.getSingletonObject();
		// Your Business Logic
		System.out.println("Singleton object obtained");
	}
}
