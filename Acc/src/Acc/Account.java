package Acc;
/**
 * 
 * @author Ruba
 *
 */
public class Account {
	
private double balance;
public int num;
public String name = "";


/**
 * Constructor with no argument
 */
public Account() {
	this.balance = 0;
}


/** 
 * Constructor with one argument
 */
public Account(int amount) {
	deposit (amount);
}


/** 
 * to return Acc number
 */
public int getAccountNum() {
	return num;
}

/** 
 * to return Acc balance
 */
public double getBalance() {
	return balance;
}

/** 
 * to return Acc name
 */
public String getName() {
	return name;
}

/** 
 * to add money to the acc (deposit)
 * The number must be positive
 * if it negative an error msg will appear
 */
public void deposit(double amount) {
	if (amount <0) {
		System.out.println("deposit fail");
	}
	else {
		balance = balance + amount;
	}
}

/** 
 * to take money from the acc (withdraw)
 * The number must be positive and less than the balance
 * if it negative or greater than balance an error msg will appear
 */
public void withdraw(double amount) {
	if (amount<0) {
		System.out.println("withdraw fail");
	}
	else {
		if (balance >0) {
			if (balance > amount) {
				balance = balance - amount;
			}
			else {
				System.out.println("invalid");
			}
		}
		else {
			System.out.println("balance is 0");
		}
	}
}

}
