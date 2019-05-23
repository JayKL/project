package repo;

import Account.Account;

public interface AccountRepo {
	public String addAccount(String account);
	
	public Account getAccount(int id);
	
	public String deleteAccount(int id);
	
	public String updateAccount(String accountChangesJSON);
	
	String getAllAccounts();
}
