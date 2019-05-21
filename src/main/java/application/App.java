package application;

import AccountManagement.AccountManagement;
import ServiceForApp.Service;

public class App{
	public App() {
		AccountManagement createAccountsRefVar=new AccountManagement();
		Service serviceRefVar = new Service();
		System.out.println("Hello world to the standard out");
	}
}
