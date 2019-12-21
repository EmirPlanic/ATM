
public class Transfer extends User {

		
		public static void transfer() {
			
            
           

			System.out.println("Enter your account number: ");
			int fromID = input.nextInt();
			System.out.println("Enter targetted account number: ");
			int toID = input.nextInt();
			System.out.println("Enter the amount you would like to transfer: ");
			double transferAmount = input.nextDouble();
			
			
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

