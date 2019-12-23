
public class Info extends User {
	
	
	public static void showInfo() {
		
		int id = 0;
		
		System.out.println("Enter your account number: ");
		 if (input.hasNextInt())
           id = input.nextInt();
     else {
         input.next();
            
       }
		
		
		if(Checkings.checkIfAccExists(id)) {

		System.out.println("********************************");
		System.out.println("Acc info: ");

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).id == id ) {
				System.out.println("Owner: " + accounts.get(i).name +
				"\nAcc number: " + accounts.get(i).id +
				"\nBalance : " + accounts.get(i).balance);
				
			}
			
		}
		System.out.println("********************************");
	}
		else System.out.println("Acc does not exist");
	}
	
}
