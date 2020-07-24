package BankAccountTransfer;

public class Account {
	String id;
	String name;
	int balance;
	public Account(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public Account(String id, String name, int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int credit(int amt) {
		this.balance += amt;
		return this.balance;
	}
	public int debit(int amt) {
		if(amt <= this.balance) {
			this.balance -= amt;
			
		}else {
			System.out.println("Amount not insufficient!");
		}
		return this.balance;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account(id="+this.id+")";
	}
	public int transferTo(Account aa, int amt) {
		if(amt <= this.balance) {
			this.balance -= amt;
		}else {
			System.out.println("Amount Exceed!");
		}
		return this.balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("1","Aung Aung");
		Account a1=new Account("2","Mya Mya",1000);
		Account a2=new Account("3","Thidar",1000);
		
		System.out.println("Your credit balance is "+a1.credit(5000));
		System.out.println("Your debit balance is "+a1.debit(1000));
		System.out.println(a1.transferTo(a1, 10000));
		System.out.println(a.toString());
	}
	

}
