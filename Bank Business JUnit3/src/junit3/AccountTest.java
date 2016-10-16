package junit3;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	Account account ; 
	
	public void setUp() throws Exception {
		account = new Account(10000);
	}

	public void testGetBalance() {
		assertEquals(10000, account.getBalance());
	}

	public void testDeposit() {
		account.deposit(1000);
		assertEquals(10000, account.getBalance());
	}

	public void testWithdraw() {
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}

}
