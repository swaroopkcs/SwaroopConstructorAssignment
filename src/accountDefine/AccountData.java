package accountDefine;

public class AccountData {
	String accountNum;
	double balance;

	public AccountData() {
		// TODO Auto-generated constructor stub
		System.out.println("Please see the details of the account");
	}

	public AccountData(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	void showBalance(String account, double bal) {
		System.out.println("The balance on the account " + account + " is " + bal);
	}

}
