package jp.co.wisdom_technology.bank;

public class TestObject {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		boolean e = (a == b);
		System.out.println("a == b " + e);
		
		String s1 = new StringBuilder().append("1").toString();
		System.out.println("s1=" + s1);
		String s2 = new StringBuilder().append("1").toString();
		System.out.println("s2=" + s2);
		boolean e2 = (s1 == s2);
		System.out.println("s1 == s2 " + e2);
		
		boolean e3 = s1.equals(s2);
		System.out.println("s1.equals(s2) " + e3);
		
		Account account1 = new Account("普通");
		account1.deposit(1000);
		VipAccount account2 = new VipAccount("VIP");
		account2.deposit(1000);
		System.out.println("account1 == account2 " + account1.equals(account2));
		
		Account account3 = new Account("高雷");
		account1.deposit(1000);
		VipAccount account4 = new VipAccount("高雷");
		account2.deposit(10000);
		System.out.println("account3 == account4 " + account3.equals(account4));
	}

}
