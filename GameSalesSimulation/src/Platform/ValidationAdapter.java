package Platform;

import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class ValidationAdapter implements UserValidationService{
	

	@Override
	public boolean isValidUser(User user) {
		KPSPublicSoap mernis = new KPSPublicSoapProxy();
		try {
			return mernis.TCKimlikNoDogrula(Long.parseLong(user.getIdString()),user.getFirstName(),user.getLastName(),user.getBirthYear());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
