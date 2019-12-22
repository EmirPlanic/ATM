import java.util.ArrayList;

public class Checkings {
	
	
	
	static boolean checkAccWhenMaking(int id, double balance) {
		
		 if (id != (int)id) {
		
			 System.out.println("Process failed");
			 return false;
		 }
		
		if (balance < 0) {
			System.out.println("Process failed");
			return false;
			}

		for (int i = 0 ; i<User.accounts.size();i++ ) {
			
		   if (id == User.accounts.get(i).getID()) {
		System.out.println("Account number already in use");
				return false;
		}
		}
		return true;
	}
		
	static boolean checkIfAccExists(int id) {
		for (int i = 0; i < User.accounts.size(); i++) {
			if (id == User.accounts.get(i).getID()) {
				
				return true;
			}
		}
		
		return false;
	}
 
	static boolean checkIfAccHasEnoughtFunds (int id,double transferAmount) {
		for (int i = 0;i<User.accounts.size();i++) {
			if(id == User.accounts.get(i).getID() && User.accounts.get(i).getBalance() >= transferAmount ) {
				
				return true;
			}
		}
		return false;
	}
	
	
		
			
	
	
	
	
}
