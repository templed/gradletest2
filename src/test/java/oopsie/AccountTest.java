package oopsie;

import model.Account;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {

	@Test
	public void CRUDSanityAccount() {
		String name = "John";
		String passwd = "secret";
		Account myAccount = new Account(name, passwd);
		
		assertEquals(myAccount.getName(), name);
		assertEquals(myAccount.getPassword(), passwd);
		
	}
	
	
}
