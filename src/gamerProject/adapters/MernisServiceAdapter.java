package gamerProject.adapters;

import java.rmi.RemoteException;

import gamerProject.busieness.abstracts.CheckGamerService;
import gamerProject.entity.abstracts.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckGamerService {

	@Override
	public boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
				user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getYearOfBirth());
		return result;
	}
}
