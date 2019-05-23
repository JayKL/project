package application;

import AccountManagement.AccountManagement;
import ServiceForApp.Service;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class App extends Application{
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
