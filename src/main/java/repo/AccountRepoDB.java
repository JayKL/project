package repo;



import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


import Account.Account;
import util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountRepoDB implements AccountRepo {
	
	@PersistenceContext(unitName="primary")
	private EntityManager entManRefVar;
	
	@Inject
	private JSONUtil util;

	public void setEntManRefVar(EntityManager entManRefVar) {
		this.entManRefVar = entManRefVar;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	@Override
	@Transactional(REQUIRED)
	public String addAccount(String account) {
		Account aAccount = util.fromJSON(account, Account.class);
		entManRefVar.persist(aAccount);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	public Account getAccount(int id) {
		return entManRefVar.find(Account.class, id);
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(int id) {
		if (entManRefVar.contains(entManRefVar.find(Account.class, id))) {
			entManRefVar.remove(entManRefVar.find(Account.class, id));
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateAccount(String accountChangesJSON) {
		Account accToChange;
		Account accUpdates = util.fromJSON(accountChangesJSON, Account.class);
		if (entManRefVar.contains(entManRefVar.find(Account.class, accUpdates.getAccountNumber()))) {
			accToChange=entManRefVar.find(Account.class, accUpdates.getAccountNumber());
		} else {
			return "{\"message\": \"account not found\"}";
		}
		accToChange.setFirstName(accUpdates.getFirstName());
		accToChange.setLastName(accUpdates.getLastName());
		return "{\"message\": \"account has been sucessfully updated\"}";
	}

	@Override
	public String getAllAccounts() {
		TypedQuery<Account> query = entManRefVar.createQuery("Select a FROM Account a", Account.class);
		Collection<Account> accounts = query.getResultList();
		return util.toJSON(accounts);
	}
}