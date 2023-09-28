package Account.Pkg;


public class Account {

	private String ID;
    private String name;
    private int balance;

    
    public Account(String ID, String name) {
    	this.ID = ID;
    	this.name = name;
    	this.balance = 0;
    }

    public Account(String ID, String name, int balance) {
    	this.ID = ID;
    	this.name = name;
    	this.balance = balance;
    }

    public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

    public int credit(int amount) {
    	balance += amount;
    	return balance;
    }

    public int debit(int amount) {
    	if (balance >= amount) {
    		balance -= amount;
        } else if (balance< 0){
        	System.out.println("Error");
        }
    	return balance;
    }

    public int transferTo(Account another, int amount) {
    	if (balance >= amount) {
    		balance -= amount;
    		another.credit(amount); 
        } else if(balance<0){
        	System.out.println("Error");
        }
    	return balance;
    }

    @Override
    public String toString() {
    	return "ID: " + ID + "\nName: " + name + "\nBalance:" + this.balance;
    }

	
}


