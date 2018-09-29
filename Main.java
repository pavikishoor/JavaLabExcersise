package com.Pavi.Converters;

import java.util.Scanner;
import com.Pavi.Main.*;
public class Main {

	public static void main(String[] args) {
    int Choice;
    Scanner input=new Scanner(System.in);
    Choice=input.nextInt();
	switch(Choice){
	case 1:
		currency_convertor.EnterChoice();
		break;
	case 2:
		DistanceConvertor.EnterChoice();
		break;
	case 3:
		TimeConverters.EnterChoice();
	default:
		break;
	}
}
	
}
