package ServiceForApp;

import Account.Account;

public class Service {

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
}
