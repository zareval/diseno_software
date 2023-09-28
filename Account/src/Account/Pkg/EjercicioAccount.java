package Account.Pkg;

public class EjercicioAccount {
	public static void main (String[] args) {
		Account miAccount = new Account("123123", "Zarella Valentina Burbano Vallejo", 200000);
        Account yourAccount = new Account("456456", "Profe Miguel Tovar", 6400000);

        miAccount.credit(200000);
        yourAccount.credit(400000);

        miAccount.debit(100000);
        yourAccount.debit(100000);
        
        yourAccount.transferTo(miAccount, 150000);

        System.out.println(miAccount);
        System.out.println(yourAccount);
	}
	
}