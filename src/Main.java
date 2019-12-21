import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		
		User acc = new User (123,"bra",150);
		User acc1 = new User (1234,"da",150);

		
	

		    while (true) {
		    	try {
		    	
		   
		    	Scanner input = new Scanner(System.in);


		            System.out.println("Main Menu: ");
		            System.out.println("1: Show Info");
		            System.out.println("2: Withdraw");
		            System.out.println("3: Deposit");
		            System.out.println("4: Transaction");
		            

		            System.out.print("Enter a choice: ");
		            int choice = input.nextInt();

		            if (choice == 1) {
		                Info.showInfo();
		                continue;
		            } else if (choice == 2) {
		               Withdraw.withdraw();
		                	continue;
		                }
		              
		            else if (choice == 3) {
		            	Deposit.deposit();
		            	continue;
		                }
		            
		            else if (choice == 4) {
		            	Transfer.transfer();
		                	continue;
	
		           }

		
		        }catch (Exception e) {
		            System.out.println("Error!");
		        }

		    }

	}
		

		
		
		
		
	
	
	
	
	
	


}
