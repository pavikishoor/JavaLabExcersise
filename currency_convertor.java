package com.Pavi.Main;

import java.util.Scanner;

public class currency_convertor {

	public static double dollor_to_inr(double dollor)
	{
		return dollor*71.83;
	}
	public static double Euro_to_inr(double Euro)
	{
		return Euro*83.99;
	}
	public static double Yen_to_inr(double Yen)
	{
		return Yen*0.69;
	}
	public static double inr_to_Dollor(double inr)
	{
		return inr/71.83;
	}
	public static double inr_to_Euro(double inr)
	{
		return inr/83.99;
	}
	public static double inr_to_yen(double inr)
	{
		return inr/0.69;
	}
	public static void EnterChoice(){
	double dollor,inr,Euro,Yen;
	int choice;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice:\n 1:Dollor to Inr \n 2:Euro to Inr\n 3:Yen to Inr \n 4:inr_to_Euro\n 5:inr_to_Yen\n 6:inr_to_Dollor\n");
	choice=input.nextInt();
	switch(choice){
	case 1:
	System.out.println("Enter in Dollors");
	dollor=input.nextDouble();
	inr=currency_convertor.dollor_to_inr(dollor);
	System.out.println(dollor+" Dollor is equalto:"+inr+"inr");
	break;
	case 2:
	System.out.println("Enter in Euros");
	Euro=input.nextDouble();
	inr=currency_convertor.Euro_to_inr(Euro);
	System.out.println(Euro+" Euro is equalto:"+inr+"Inr");
    break;
	case 3:
		System.out.println("Enter in Yen");
		Yen=input.nextDouble();
		inr=currency_convertor.Yen_to_inr(Yen);
		System.out.println(Yen+" Yen is equalto: "+inr+" Inr");
	    break;
	case 4:
		System.out.println("Enter in Inr");
		inr=input.nextDouble();
		Euro=currency_convertor.inr_to_Euro(inr);
		System.out.println(inr+" Inr is equalto: "+Euro+" Euro");
	    break; 
	case 5:
		System.out.println("Enter in Inr");
		inr=input.nextDouble();
		Yen=currency_convertor.inr_to_yen(inr);
		System.out.println(inr+" Inr is equalto: "+Yen+" Yen");
	    break; 
	case 6:
		System.out.println("Enter in Inr");
		inr=input.nextDouble();
		dollor=currency_convertor.inr_to_Dollor(inr);
		System.out.println(inr+" Inr is equalto: "+dollor+" Dollor");
	    break;    
	default:
		break;
}
	}
	
}
