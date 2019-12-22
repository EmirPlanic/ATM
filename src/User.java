import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public  class User {

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
			
			int id = 0;
			double balance = 0;
			
			System.out.print("Enter Account ID: ");
			 if (input.hasNextInt())
		            id = input.nextInt();
		      else {
		          input.next();
		             
		        }
			 
			 
			
			System.out.print("Enter Name: ");
			String name=input.next();
			
			
			
			
			System.out.print("Enter Balance: ");
			if (input.hasNextDouble())
	            balance = input.nextDouble();
	      else {
	          input.next();
	             
	        }
	
			
			
			newAccount(id,name,balance);

			
			
			
		}
		
		public static void newAccount(int id, String name,double balance ) {

			if (Checkings.checkAccWhenMaking(id, balance)) {
			User accounts = new User(id, name, balance);
				
			System.out.println("Account created successfully!");
			}
			else
				System.out.println("Failed to creat account");
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

