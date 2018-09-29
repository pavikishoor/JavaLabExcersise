package com.Pavi.Main;

import java.util.Scanner;

public class DistanceConvertor {

	public static double metre_to_KM(double metre)
	{
		return metre/1000;
	}
	public static double mile_to_KM(double mile)
	{
		return mile*1.60934;
	}
	public static double KM_to_metre(double km)
	{
		return km*1000;
	}
	public static double KM_to_mile(double km)
	{
		return km/1.60934;
	}
	public static void EnterChoice(){
		double km,mile,metre;
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice:\n 1:mile to KM \n 2:metre to KM\n 3:KM to metre \n 4:KM to mile\n");
		choice=input.nextInt();
		switch(choice){
		case 1:
		System.out.println("Enter in Mile");
		mile=input.nextDouble();
		km=DistanceConvertor.mile_to_KM(mile);
		System.out.println(mile+" Mile is equalto:"+km+"km");
		break;
		case 2:
			System.out.println("Enter in metre");
			metre=input.nextDouble();
			km=DistanceConvertor.metre_to_KM(metre);
			System.out.println(metre+" metre is equalto:"+km+"km");
			break;
		case 3:
			System.out.println("Enter in Kilometre");
			km=input.nextDouble();
			mile=DistanceConvertor.KM_to_mile(km);
			System.out.println(km+" Kilometre is equalto:"+mile+"mile");
			break;
		case 4:
			System.out.println("Enter in Kilometre");
			km=input.nextDouble();
			metre=DistanceConvertor.KM_to_metre(km);
			System.out.println(km+" Kilometre is equalto:"+metre+"metre");
			break;
		
		default:
			break;
	}
	}
}
