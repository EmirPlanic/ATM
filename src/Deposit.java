
public class Deposit extends User {
	
	public static void deposit () {
		
        
       

		System.out.println("Enter your account number: ");
		int id = input.nextInt();
		System.out.println("Enter deposit amount");
		double amount = input.nextDouble();
		
		
		
 if ( Checkings.checkIfAccExists(id)){
		
			for (int i = 0; i < User.accounts.size(); i++) {
				if (User.accounts.get(i).getID() == id) {
					User.accounts.get(i).setBalance(User.accounts.get(i).getBalance()+amount);
				}
				
			}
			
			System.out.println("Deposit complete!");
 }
else
	System.out.println("Deposit failed");
			
		
		 
	}

}
