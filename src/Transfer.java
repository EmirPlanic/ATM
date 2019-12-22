
public class Transfer extends User {

		
		public static void transfer() {
			
			int fromID = 0;
			int toID = 0;
			double transferAmount = 0;
            
           

			System.out.println("Enter your account number: ");
			 if (input.hasNextInt())
		            fromID = input.nextInt();
		      else {
		          input.next();
		             
		        }
		
			System.out.println("Enter targetted account number: ");
			if (input.hasNextInt())
	            toID = input.nextInt();
	      else {
	          input.next();
	             
	        }
		
			System.out.println("Enter the amount you would like to transfer: ");
			if (input.hasNextDouble())
	            transferAmount = input.nextDouble();
	      else {
	          input.next();
	             
	        }

			
			
     if (Checkings.checkIfAccHasEnoughtFunds(fromID , transferAmount) && Checkings.checkIfAccExists(fromID) && Checkings.checkIfAccExists(toID)){
			
				for (int i = 0; i < User.accounts.size(); i++) {
					if (User.accounts.get(i).getID() == fromID) {
						User.accounts.get(i).setBalance(User.accounts.get(i).getBalance()-transferAmount);
					}
					if (User.accounts.get(i).getID() == toID) {
						User.accounts.get(i).setBalance(User.accounts.get(i).getBalance()+transferAmount);
					}
				}
				
				System.out.println("Transfer complete!");
     }
	else
		System.out.println("Transaction failed");
				
			
			 
		}
		
		
}

