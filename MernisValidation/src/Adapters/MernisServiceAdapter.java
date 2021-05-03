package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap mernis = new KPSPublicSoapProxy();
		try {
			return mernis.TCKimlikNoDogrula(Long.parseLong(customer.id),customer.getFirstName(),customer.getLastName(),customer.getBirthYear());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
}
