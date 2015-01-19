package com.tests.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote {
	public int addMe(int num1, int num2) throws RemoteException;

}
