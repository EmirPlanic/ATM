import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class User {

	protected  int id;
	
	protected  double balance;

	protected  String name;

	static	ArrayList<User> accounts = new ArrayList<User>();
	
	

	static Scanner input = new Scanner(System.in);

		
       User(){
    	   
       }
		
		
		

		public User(int id,String name,double balance) {
		    this.id = id;
		    this.name = name;
		    this.balance = balance;
		    
		    
		    accounts.add(this);

		}
		
		
		static void openAccount()
		{ 
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter Account ID: ");
			int id=input.nextInt();
			System.out.print("Enter Name: ");
			String name=input.next();
			System.out.print("Enter Balance: ");
			double balance=input.nextDouble();
			
			
			newAccount(id,name,balance);

			
			
			
		}
		
		public static void newAccount(int id, String name,double balance ) {

			if (Checkings.checkAccWhenMaking(id, balance)) {
			User accounts = new User(id, name, balance);
				
			System.out.println("Account created successfully!");
			}
		}
		

		
		public void setBalance(double balance) {
		   this.balance=balance;
		}
	
		

		public double getBalance() {
		    return balance;
		}

		public int getID() {
		    return id;
		}
		
		public String getName() {
			return name;
		}

	}

