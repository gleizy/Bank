package jp.co.wisdom_technology.bank;

public class VipAccount extends Account {
	public VipAccount(String name) {
		super(name);
	}
	
	public void addAmount() {
		this.amount = (int)(this.amount * 1.1);
	}
	
	@Override
	public int withdraw(int money) {
		if (this.amount * 1.1 >= money) {
			this.amount = this.amount - money;
			return money;
		} else {
			money = (int)(this.amount * 1.1);
			this.amount = this.amount - money;
			return money;
		}		
	}
}
