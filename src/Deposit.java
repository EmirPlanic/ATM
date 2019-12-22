
public class Deposit extends User {
	
	public static void deposit () {
		
        int id=0;
        int amount=0;

		System.out.println("Enter your account number: ");
		 if (input.hasNextInt())
            id = input.nextInt();
      else {
          input.next();
             
        }

		System.out.println("Enter deposit amount");
		 if (input.hasNextInt())
	            amount = input.nextInt();
	         else {
	          input.next();
	             
	         }
		

		
		
		
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
