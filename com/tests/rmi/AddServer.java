package com.tests.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServer extends UnicastRemoteObject implements AddInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddServer() throws RemoteException{
		
	}

	@Override
	public int addMe(int num1, int num2) throws RemoteException {
		
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	
}
