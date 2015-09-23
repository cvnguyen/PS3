package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAccount() {
		//fail("Not yet implemented");
		Account testPerson = new Account(1122, 20000);
		testPerson.setAnnualInterestRate(4.5);
		try{
			testPerson.withdraw(2500);
		} catch(InsufficientFundsException e){
		}
		testPerson.deposit(3000);
		System.out.println("The interest rate monthly is: " + testPerson.getMonthlyInterestRate());
		System.out.println("The balance is " +testPerson.getBalance() + "\n" + "This account was created on " + testPerson.getDate());
		
	}
}
