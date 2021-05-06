package eCommerceBackEnd.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceBackEnd.business.abstracts.ValidationService;
import eCommerceBackEnd.dataAccess.abstracts.UserDao;
import eCommerceBackEnd.entities.concretes.User;

public class UserValidation implements ValidationService{
	
	

	@Override
	public boolean isValid(User user) {
		
		final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
        if(!matcher.find()) {
        	System.out.println(user.getEmail()+" E-mail is incorrect.");
        	return false;
        }
        
        if( user.getFirstName().length() < 3) {
        	System.out.println("First name of user is less than 2 characters.");
        	return false;
        }
        
        if( user.getLastName().length() < 3) {
        	System.out.println("Last name of user is less than 2 characters.");
        	return false;
        }
        
        if( user.getPassword().length() < 6) {
        	System.out.println("Password must be greater than 6 characters.");
        	return false;
        }
		
        
        return true;
		
	}
}
