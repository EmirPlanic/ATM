import java.util.Scanner;

public class Menu {
	
	
	static void menuOption () {
	
	while (true) {
    	try {
    	
   
    	Scanner input = new Scanner(System.in);


            System.out.println("Main Menu: ");
            System.out.println("1: Show Info");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Transaction");
            System.out.println("5: Make a new Acc");
            

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
            else if (choice == 5) {
            	User.openAccount();
            	continue;
            }
            else if (choice <= 0 && choice > 5)
            	System.out.println("U can only choose numbers from 1 to 5");


        }catch (Exception e) {
            System.out.println("Error!");
            
        }

    }
	
	}
	
}

