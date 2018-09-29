import java.io.*;
import java.util.*;

interface StackOperation{
	void push(int element);
	void pop();
	void top();
	void display();
}

class MyStack implements StackOperation{
	int[] data=new int[5];
	int top = -1;
	@Override
	public void push(int element){
		try{
		top++;
		data[top]=element;
		System.out.println(data[top]+" is pushed");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\n You can't push \n");
			System.out.println(" POP An ELEMENT \n");
			top--;
		}
		
	}

	@Override
	public void pop() {
		try{
		int Pop_element = data[top];
		data[top]=0;
		top--;
		System.out.println("POPPED ELEMENT IS "+Pop_element);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You cant POP");
			System.out.println("Perform Push Operation");
			top++;
		}
	}

	@Override
	public void top() {
		System.out.println("Top Value is :"+top);
		
	}

	@Override
	public void display() {
		System.out.println("Stack Elements Are :\n");
		for(int i=data.length-1;i>=0;i--){
			System.out.println(data[i]);
		}
		
	}
}

public class Interface {

	
	public static void main(String[] args) {
		MyStack s=new MyStack();
		Scanner input = new Scanner(System.in);
		int choice,choice1;
		boolean ch=true;
		do{
			System.out.println("Stack Operations \n 1: Push \n 2: Pop \n 3: Top \n 4: Display \n");
			choice=input.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter Element To push \n");
				int element=input.nextInt();
				s.push(element);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.top();
				break;
			case 4:
				s.display();
				break;
			default:
				System.out.println("Enter Correct Option");
				break;
			}
			System.out.println("To Perform Stack Opertion , Press 1\n");
			choice1=input.nextInt();
			if (choice1==1)
				ch=true;
			else
				ch=false;
		}while(ch);
		

	}

}
