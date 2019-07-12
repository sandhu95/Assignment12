import static org.junit.Assert.*;

import org.junit.Test;

public class TestAccount {

	@Test
	public void testNewAccount() 
	{

	// Create a new account and initialize it as 100.
	Account objAccount = new Account(100);

	// Expected Balance : 0, Actual Balance we will get from balance function
	assertEquals(0, objAccount.balance());
	}

	@Test
	public void testWithdrawnMoney() 
	{
	// Create a new account and initialize it to 100
	Account account = new Account(100);
	//	Withdrawing $50 from the account.
	account.withdraw(50);
	//expecting output
	int expectedBalance=50;
	//Comparing the results
	assertEquals(expectedBalance, account.balance());
	}

	@Test
	public void testDepositMoney() 
	{
	// Create a new account and initialize it to 0
	Account account = new Account(0);
	//getting the balance from account
	int initialBalance =  account.balance();
	//depositing money in the account
	account.deposit(50);
	int afterBalance = initialBalance + 50;
	//Comparing the results
	assertEquals(afterBalance, account.balance());
	}

	@Test
	public void testWithdrawnMoreMoneyThanBalance() 
	{
	// Create a new account and initialize it to 100
	Account account = new Account(100);
	//withdrawing more than actual money from the account
	account.withdraw(150);
	//Comparing the results
	assertEquals(100, account.balance());
	}
	
	@Test
	public void testWithdrawInvalidAmount() 
	{
	// Create a new account and initialize it to 100
	Account account = new Account(100);
	//withdrawing invalid amount from account
	account.withdraw(-150);
	//Comparing the results
	assertEquals(100, account.balance());
	}
	@Test
	public void testDepositInvalidAmount() 
	{
	// Create new account and initialize it to 100
	Account account = new Account(100);
	//depositing invalid amount into account
	account.deposit(-150);
	//Comparing the results
	assertEquals(100, account.balance());
	}	
		


}
