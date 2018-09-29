import java.util.ArrayList;
import java.util.Scanner;


public class Customer {

	int accno;
	String name;
	String mailId;
	int balance;
	public Customer(int acno,String Name,String Mail_id,int Balance){
		this.accno=acno;
		this.name=Name;
		this.mailId=Mail_id;
		this.balance= Balance;
	}
	
	void debitTranscation(int amount){
		try{
			if(this.balance>=amount)
		this.balance=this.balance-1;
		throw new DebitException("In Sufficient Balance");
	}
		catch(DebitException e){
			System.out.println( e.getMessage());
			int new_amount=new Scanner(System.in).nextInt();
			System.out.println("Enter Amount Less than "+balance);   
			debitTranscation(new_amount);
		}
	}
	void creditTranscation(int amount){
		
	}
	void displayDetails(){
		System.out.println(""+accno);
		System.out.println(""+name);
		System.out.println(""+mailId);
		System.out.println(""+balance);
	}
}


class Bank{
	ArrayList<Customer> bankrecord;
	public Bank(){
		bankrecord = new ArrayList<Customer>();
	}
}
