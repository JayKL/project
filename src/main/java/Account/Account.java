package Account;

public class Account {
	private String firstName;
	private String lastName;
	private int accountNumber;
	private int money=0;


	public Account(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
}
