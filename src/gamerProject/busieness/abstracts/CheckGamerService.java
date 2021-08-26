package gamerProject.busieness.abstracts;

import java.rmi.RemoteException;

import gamerProject.entity.abstracts.User;

public interface CheckGamerService {
	boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException;

}
