package jp.co.wisdom_technology.bank;

public class Account {
	private static int account_counts = 0;
	public static int ShowAccountCount() {
		return account_counts;
	}
	
	protected int amount = 0;
	
	protected String name;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	//Property

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(String name) {
		this.name = name;
		account_counts = account_counts + 1;
	}
	
	public void deposit(int money) {
		this.amount = this.amount + money;
	}
	
	public int withdraw(int money) {
		if (this.amount >= money) {
			this.amount = this.amount - money;
			return money;
		} else {
			money = this.amount;
			this.amount = 0;
			return money;
		}		
	}
	
	@Override
	public boolean equals(Object o) {
		Account a = (Account)o;	
//		if (this.amount == a.amount) {
//			return true;
//		} else {
//			return false;
//		}
		if (this.name.equals(a.name)) {
			return true;
		} else {
			return false;
		}
	}
}
