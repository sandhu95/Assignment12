import static org.junit.Assert.*;

import org.junit.Test;

public class TestBank {

	@Test
	public void testNewBank()
	{
		//Creating  new Bank Class Object
		Bank Bank1 = new Bank();
		//Getting the number of customers in newly created Bank
		int NumberOfCustomers = Bank1.getNumberOfCustomers();
		//Comparison of results
		assertEquals(0,NumberOfCustomers);
	}
	@Test
	public void testAddCustomers()
	{
		//Creating a new Bank Class Object
		Bank bank = new Bank();
		//Getting the number of customers in newly created Bank
		int currentNumberOfCustomers = bank.getNumberOfCustomers();
		int expectedNumbersOfCustomers = currentNumberOfCustomers;
		//Adding new customers in Bank
		bank.addCustomer("Mohit", 500);
		//Getting the number of customers after adding the new customer
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		expectedNumbersOfCustomers += 1;
		//Comparison of results
		assertEquals(expectedNumbersOfCustomers,currentNumberOfCustomers);
		//Adding new customers in Bank
		bank.addCustomer("Rupinder", 50);
		//Getting the number of customers after adding the new customer second time
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		expectedNumbersOfCustomers += 1;
		//Comparison of results
		assertEquals(expectedNumbersOfCustomers,currentNumberOfCustomers);
	}
	
	@Test
	public void testRemoveCustomers()
	{
		//Creating a new Bank Class Object
		Bank bank = new Bank();
		//Getting the number of customers in newly created Bank
		int currentNumberOfCustomers = bank.getNumberOfCustomers();
		//Adding the number of customers in Bank
		bank.addCustomer("Mohit", 500);
		bank.addCustomer("Rupinder", 50);
		//Getting the current number of customers
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		int expectedNumbersOfCustomers = currentNumberOfCustomers;
		//removing  a customer named Mohit
		bank.removeCustomer("Mohit");
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		//decreasing the Expected number of customers
		expectedNumbersOfCustomers--;
		assertEquals(expectedNumbersOfCustomers,currentNumberOfCustomers);
		//removing  second customer named Rupinder
		bank.removeCustomer("Rupinder");
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		//decreasing the Expected number of customers
		expectedNumbersOfCustomers--;
		//Comparison of results
		assertEquals(expectedNumbersOfCustomers,currentNumberOfCustomers);
	}
	
	@Test
	public void testRemoveNonExistingCustomer()
	{
		//Creating a new Bank Class Object
		Bank bank = new Bank();
		//Getting the number of customers in newly created Bank
		int currentNumberOfCustomers = bank.getNumberOfCustomers();
		
		//Adding the number of customers in Bank
		bank.addCustomer("Mohit", 500);
		bank.addCustomer("Rupinder", 50);
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		int expectedNumbersOfCustomers = currentNumberOfCustomers;
		//removing  second customer which do not exist
		bank.removeCustomer("vipan");
		currentNumberOfCustomers = bank.getNumberOfCustomers();
		// comparing results
		assertEquals(expectedNumbersOfCustomers,currentNumberOfCustomers);
	}
	
	@Test
	public void TransferMoneyBetweenAccounts()
	{
		//Creating a new Bank Class Object
		Bank Bank1 = new Bank();
		//Creating a new Customer
		Bank1.addCustomer("Mohit",500);
		Bank1.addCustomer("Rupinder",50);
		Customer Customer1 = Bank1.getCustomers().get(0);
		//Creating another new Customer
		Customer Customer2 = Bank1.getCustomers().get(1);
		//Creating a new Account
		Account Account1 = Customer1.getAccount();
		//Creating another new Account
		Account Account2 = Customer2.getAccount();
		//Storing the initial Balances
		int InitialBalance1 = Account1.balance();
		int InitialBalance2 = Account2.balance();
		//Checking the initial Balances
		assertEquals(500,InitialBalance1);
		assertEquals(50,InitialBalance2);
		//Transferring the money between Accounts
		Bank1.transferMoney(Customer1, Customer2 , 300);
		//Storing the new Balances
		int Balance1 = Account1.balance();
		int Balance2 = Account2.balance();
		//Comparing the new Balances
		assertEquals(200,Balance1);
		assertEquals(350,Balance2);
	}
	@Test
	public void TransferMoreMoneyBetweenAccounts()
	{
		//Creating a new Bank Class Object
		Bank Bank1 = new Bank();
		//Creating a new Customer
		Bank1.addCustomer("Mohit",500);
		Bank1.addCustomer("Rupinder",50);
		Customer Customer1 = Bank1.getCustomers().get(0);
		//Creating another new Customer
		Customer Customer2 = Bank1.getCustomers().get(1);
		//Creating a new Account
		Account Account1 = Customer1.getAccount();
		//Creating another new Account
		Account Account2 = Customer2.getAccount();
		//Storing the initial Balances
		int InitialBalance1 = Account1.balance();
		int InitialBalance2 = Account2.balance();
		//Checking the initial Balances
		assertEquals(500,InitialBalance1);
		assertEquals(50,InitialBalance2);
		//Transferring more than actual money between Accounts
		Bank1.transferMoney(Customer1, Customer2 , 700);
		//Storing the new Balances
		int Balance1 = Account1.balance();
		int Balance2 = Account2.balance();
		//Comparing the new Balances
		assertEquals(500,Balance1);
		assertEquals(50,Balance2);
	}
}
