package application;

import AccountManagement.AccountManagement;
import ServiceForApp.Service;

public class App{
	private AccountManagement accountManageVar=new AccountManagement();
	private Service serviceRefVar = new Service(accountManageVar);

	public Service getServiceRefVar() {
		return serviceRefVar;
	}

	public AccountManagement getAccountManageVar() {
		return accountManageVar;
	}
	
	public App() {
		System.out.println("Hello world to the standard out");
		accountManageVar.createJSONFromMap();
	}
}
