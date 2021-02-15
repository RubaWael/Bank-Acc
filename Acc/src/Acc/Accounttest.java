package Acc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Ruba
 *
 */

class Accounttest {
	
	/** 
	 * to test the return nunmber of getAccountNum
	 */
	@Test
	void testgetAccountNum() {
	Account account = new Account();
		assertEquals(0, account.getAccountNum());
	}
	
	
	
	
	/** 
	 * to test the return name of getName
	 */
	@Test
	void testgetName() {
		Account account = new Account();
		assertEquals("", account.getName());
	}
	
	
	
	/** 
	 * to test the return nunmber getBalance if no deposit happened (first time)
	 */
	@Test
	void testgetBalance0() {
		Account account = new Account();
		assertEquals(0, account.getBalance());
	}
	
	/** 
	 * to test the return nunmber getBalance if deposit happened
	 */
	@Test
	void testgetBalance() {
		Account account = new Account(700);
		assertEquals(700, account.getBalance());
	}

	
	/** 
	 * to test the correct deposit happened
	 * add positive number 
	 */
	@Test
	void testValiddeposit() {
		Account account = new Account();
		account.deposit(500);
		assertEquals(500, account.getBalance());
	}
	
	/** 
	 * to test the incorrect deposit happened
	 * add negative number 
	 * error msg appear
	 * will not take the action (do not make change)
	 */
	@Test
	void testInValiddeposit() {
		Account account = new Account();
		account.deposit(-500);
		assertEquals(0, account.getBalance());
	}
	
	
	
	/** 
	 * to test the correct Withdraw happened
	 * add positive number 
	 * less than the balance
	 */
	@Test
	void testWithdraw1() {
		Account account = new Account();
		account.deposit(500);
		account.withdraw(100);
		assertEquals(400, account.getBalance());
	}
	
	/** 
	 * to test the incorrect Withdraw happened
	 * add negative number 
	 * less than the balance
	 * will not take the action (do not make change)
	 */
	@Test
	void testWithdraw2() {
		Account account = new Account();
		account.deposit(600);
		account.withdraw(-500);
		assertEquals(600, account.getBalance());
	}
	
	/** 
	 * to test the correct Withdraw happened
	 * add positive number 
	 * greater than the balance
	 * will not take the action (do not make change)
	 */
	@Test
	void testWithdraw3() {
		Account account = new Account();
		account.deposit(600);
		account.withdraw(1500);
		assertEquals(600, account.getBalance());
	}
	
	/** 
	 * to test the correct Withdraw happened
	 * add positive number 
	 * the balance =0
	 * will not take the action (do not make change)
	 */
	@Test
	void testWithdraw4() {
		Account account = new Account();
		account.withdraw(1500);
		assertEquals(0, account.getBalance());
	}
	
}

