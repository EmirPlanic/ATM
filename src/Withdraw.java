
public class Withdraw extends User {
	
	

	public static void withdraw () {
		
        int id = 0;
        double amount = 0;
	       

		System.out.println("Enter your account number: ");
		 if (input.hasNextInt())
	            id = input.nextInt();
	      else {
	          input.next();
	             
	        }
	
		System.out.println("Enter withdraw amount");
		if (input.hasNextDouble())
            amount = input.nextDouble();
      else {
          input.next();
             
        }
		
		
		
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