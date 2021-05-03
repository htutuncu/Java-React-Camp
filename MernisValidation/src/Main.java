import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer("123456789","Hikmet","Tütüncü",1996);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		

	}

}
