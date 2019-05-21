package application;

import AccountManagement.AccountManagement;
import ServiceForApp.Service;

public class App{
	public static void main(String xyz[]) {
		App appref = new App();
	}
	
	public App() {
		AccountManagement accountManageVar=new AccountManagement();
		Service serviceRefVar = new Service();
		accountManageVar.createAccount("Gnome", "King");
		accountManageVar.createAccount("Ben", "Till");
		System.out.println("Hello world to the standard out");
		accountManageVar.createJSONFromMap();
	}
}
