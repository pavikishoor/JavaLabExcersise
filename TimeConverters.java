package com.Pavi.Main;

import java.util.Scanner;

public class TimeConverters {

	public static double Hour_to_Minute(double hour)
	{
		return hour*60;
	}
	public static double Hour_to_Second(double hour)
	{
		return hour*3600;
	}
	public static double Minute_to_Hour(double minute)
	{
		return minute/60;
	}
	public static double Second_to_Hour(double second)
	{
		return second*3600;
	}
	public static void EnterChoice(){
		double hour, minute,second;
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice:\n 1:Hour_to_Minute \n 2:Hour_to_Second\n 3:Minute_to_Hour \n 4:Second_to_Hour\n");
		choice=input.nextInt();
		switch(choice){
		case 1:
		System.out.println("Enter in hour");
		hour=input.nextDouble();
		minute=TimeConverters.Hour_to_Minute(hour);
		System.out.println(hour+"hour is equalto:"+minute+"minute");
		break;
		case 2:
			System.out.println("Enter in Hour");
			hour=input.nextDouble();
			second=TimeConverters.Hour_to_Second(hour);
			System.out.println(hour+" Hour is equalto:"+second+"Second");
			break;
		case 3:
			System.out.println("Enter in minute");
			minute=input.nextDouble();
			hour=TimeConverters.Minute_to_Hour(minute);
			System.out.println(minute+" minute is equalto:"+hour+"hour");
			break;
		case 4:
			System.out.println("Enter in second");
			second=input.nextDouble();
			hour=TimeConverters.Second_to_Hour(second);
			System.out.println(second+" second is equalto:"+hour+"hour");
			break;
		
		default:
			break;
	}
	}
}
