package ServiceForApp;

import javax.inject.Inject;

import repo.AccountRepo;
import util.JSONUtil;


public class AccountService {
	@Inject
	JSONUtil json;

	@Inject
	AccountRepo repo;

	public AccountService() {
	}

	public String addAccount(String accountJSON) {
		return this.repo.addAccount(accountJSON);
	}

	public void setJson(JSONUtil json) {
		this.json = json;
	}

	public void setRepo(AccountRepo repo) {
		this.repo = repo;
	}

	public String getAccount(int number) {
		return this.json.toJSON(this.repo.getAccount(number));
	}
	
	public String deleteAccount(int number) {
		return this.json.toJSON(this.repo.deleteAccount(number));
	}
	
	public String getAllAccounts() {
		return this.json.toJSON(this.repo.getAllAccounts());
	}
	
	public String updateAccount(String accountChangesJSON) {
		return this.repo.updateAccount(accountChangesJSON);
	}
	
}
