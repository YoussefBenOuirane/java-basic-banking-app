import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
	Account acc = null;
	Scanner sc = new Scanner (System.in);
	
	while(true) {
		System.out.println("1. Create Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Details");
		System.out.println("5. Exit");
		System.out.println("enter an option: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1 :
			if(acc == null) {
				System.out.println("enter account number :");
				long acno = sc.nextLong();
				sc.nextLine();
				System.out.println("enter account holder's name :");
				String name = sc.nextLine();
				
				System.out.println("enter initial deposit :");
				float amt = sc.nextFloat();
				//create account object
				acc = new Account(acno,name,amt);
				System.out.println("ACCOUNT CREATED");
			} else {
				System.out.println("Account already exist ! ");
			}
			break;
		case 2 : if (acc != null) {
		System.out.println("enter amount to deposit :");
		float amt = sc.nextFloat();
		acc.deposit(amt); 
		} else {
			System.out.println("Create an Account First");
		}
			break;
		case 3 :
			if (acc != null) {
				System.out.println("enter amount to withdraw :");
				float amt = sc.nextFloat();
				acc.deposit(amt);}
			else {
				 System.out.println("Create an Account First");}
			break;
		case 4 :
			if(acc != null) {
			acc.getBalance();
			}
			break;
		case 5 :
			System.out.println("Application Closed");
			System.exit(0);
			break;
			
			default : System.out.println("Invalide Option");
		
		
		}//switch
		System.out.println("-----------------------------------------------");
	}

	}

}
