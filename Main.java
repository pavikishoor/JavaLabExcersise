import java.io.*;
import java.util.*;
class Employee{
String Emp_name,Mail_id,Address;
long Moblie_no;
int Emp_id;
int Bp;
Employee(int Bp)
{
	this.Bp=Bp;
}
void get_details(){
	Scanner input = new Scanner(System.in);
	System.out.println("EMPLOYEE ID :");
	this.Emp_id=input.nextInt();
	System.out.println("EMPLOYEE NAME :");
	this.Emp_name=input.nextLine();
	System.out.println("EMPLOYEE MOBILE NO :");
	this.Moblie_no=input.nextLong();
	System.out.println("EMPLOYEE MAIL :");
	this.Mail_id=input.nextLine();
	System.out.println("EMPLOYEE ADDRESS :");
	this.Address=input.nextLine();
}
void display(){
	System.out.println("EMPLOYEE ID :"+Emp_id);
	System.out.println("EMPLOYEE NAME :"+Emp_name);
	System.out.println("EMPLOYEE MOBILE NO :"+Moblie_no);
	System.out.println("EMPLOYEE MAIL :"+Mail_id);
	System.out.println("EMPLOYEE ADDRESS :"+Address);
}

void genPay(){
	double DA,HRA,ClubFund,GrossSalary;
	System.out.println("Enter Your Basic Pay\t:");
	DA=BP*97/100;
	HRA=BP*10/100;
	ClubFund=BP*1/1000;
	GrossSalary=BP+DA+HRA;
	if(GrossSalary>15000.0){
	PF=BP*12/100;
	}
	Deduction=PF+ClubFund;
	NetSalary=GrossSalary-Deduction;
	System.out.print("NetSalary\t:"+NetSalary);
}
}

}


public class Main {

	public static void main(String[] args) {


	}

}
