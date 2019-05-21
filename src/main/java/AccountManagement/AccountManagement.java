package AccountManagement;

import java.util.HashMap;
import java.util.Map;

import Account.Account;

public class AccountManagement {
	private Map<Integer, Account> mapOfAccounts = new HashMap<>();;

	private int accountNumberCounter = 1;

	public void createAccount(String firstName, String lastName) {
		Account createdNewAcc = new Account(firstName, lastName);
		createdNewAcc.setAccountNumber(accountNumberCounter);
		mapOfAccounts.put(accountNumberCounter++, createdNewAcc);
	}

	public Map<Integer, Account> getMapRefVarforCreateAccounts() {
		return mapOfAccounts;
	}
	
	public Account getAccount(int accountNumber) {
		return mapOfAccounts.get(accountNumber);
	}
	
	public void deleteAccount(int accountNumber) {
		mapOfAccounts.keySet().removeIf(key -> key == accountNumber);
	}
}
