package gamerProject.busieness.concretes;

import java.rmi.RemoteException;

import gamerProject.busieness.abstracts.CheckGamerService;
import gamerProject.entity.abstracts.User;

public class CheckGamerManager implements CheckGamerService {

	@Override
	public boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException {
		return true;
	}

}
