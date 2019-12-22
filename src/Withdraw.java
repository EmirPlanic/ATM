
public class Withdraw extends User {
	
	

	public static void withdraw () {
		
        
	       

		System.out.println("Enter your account number: ");
		int id = input.nextInt();
		System.out.println("Enter withdraw amount");
		double amount = input.nextDouble();
		
		
		
 if ( Checkings.checkIfAccExists(id) && Checkings.checkIfAccHasEnoughtFunds(id , amount)){
		
			for (int i = 0; i < User.accounts.size(); i++) {
				if (User.accounts.get(i).getID() == id) {
					User.accounts.get(i).setBalance(User.accounts.get(i).getBalance()-amount);
				}
				
			}
			
			System.out.println("Withdraw complete!");
 }
else
	System.out.println("Withdraw failed");
}
}