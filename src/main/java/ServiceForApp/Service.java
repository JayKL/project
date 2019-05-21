package ServiceForApp;

import java.util.Map;

import Account.Account;
import AccountManagement.AccountManagement;

public class Service {
	AccountManagement accountManageVar;

	public Service(AccountManagement accountManageVar) {
		this.accountManageVar = accountManageVar;
	}

	public void addMoney(int moneyToAdd, Account accRefVar) {
		accRefVar.setMoney(accRefVar.getMoney() + moneyToAdd);
	}

	public void takeMoney(int moneyToTake, Account accRefVar) {
		if (accRefVar.getMoney() >= moneyToTake) {
			accRefVar.setMoney(accRefVar.getMoney() - moneyToTake);
		} else {
			System.out.println("service denied");
		}
	}

	public long countFirstNames(String filterFirstName) {
		return accountManageVar.getMapRefVarforCreateAccounts().values().stream()
				.filter(x -> x.getFirstName().equals(filterFirstName)).count();
	}
}
