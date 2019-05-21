package AccountManagement;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

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

	public void createJSONFromMap() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String mapJSON;
			mapJSON = mapper.writeValueAsString(mapOfAccounts);
			System.out.println(mapJSON);
		} catch (Exception E) {
			System.out.println(E);
		}
	}
}
