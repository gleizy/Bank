package jp.co.wisdom_technology.bank;

public class Bank {

	public static void main(String[] args) {
		
		System.out.println("account_counts=" + Account.ShowAccountCount());
		
		Account[] accounts = {new Account("普通"), new VipAccount("VIP")};
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].deposit(10000);
			System.out.println("引き出した金額：" + accounts[i].withdraw(11000));
			System.out.println(accounts[i].name + "の残高は" + accounts[i].getAmount());
		}
		
		Account gaoleiAccount = new VipAccount("高雷");
		gaoleiAccount.deposit(10000);
		//gaoleiAccount.amount = gaoleiAccount.amount + 10000;
		System.out.println("引き出した金額：" + gaoleiAccount.withdraw(11050));
		//gaoleiAccount.addAmount();
		
		System.out.println(gaoleiAccount.name + "の残高は" + gaoleiAccount.getAmount());

		System.out.println("account_counts=" + Account.ShowAccountCount());
	}

}
