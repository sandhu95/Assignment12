import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void testNewCustomerAccount() 
	
	{
		//Creating a new customer
		Customer Customer1 = new Customer("Mohit",500);
		//fetching account of newly created customer
		Account Account1 = Customer1.getAccount();
		//checking if the newly created customer already has account by checking the balance
		assertEquals(500,Account1.balance());
		
	}
	
	@Test
	public void testNewCustomerWithInitialDeposit() 
	{
		//Creating new customer
		Customer Customer1 = new Customer("Mohit",500);
		//fetching account of newly created customer
		Account Account1 = Customer1.getAccount();
		//checking if the newly created customer has account with some initial balance.
		assertEquals(500,Account1.balance());
		
	}
	
	@Test
	public void testNewCustomerWithNoDeposit() {
		try
		{
			//Creating new customer
		Customer Customer1 = new Customer("Mohit",0);
		//fetching account of newly created customer
		Account Account1 = Customer1.getAccount();
		//checking if the newly created customer has account with some initial balance.
		assertEquals(0,Account1.balance());
		}
		//Handling the initial zero balance exception
		catch(Exception e)
		{
			fail("Account can not be created with zero balance!");
		}
		
	}

}
