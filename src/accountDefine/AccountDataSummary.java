package accountDefine;

public class AccountDataSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountData accountData = new AccountData();
		AccountData account1 = new AccountData("5111111111111111", 4560.25);
		account1.showBalance(account1.accountNum, account1.balance);
	}

}
