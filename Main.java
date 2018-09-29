import java.util.*;

 class Square extends Thread{
	int num;
	int square;
	Square(int num)
	{
		this.num=num;
	}
		public void run(){
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(" ");
				}
			square=num*num;
			System.out.println(num+" Square is "+square);	
	}
}
  
class Cube extends Thread{
	
	int num;
	int square;
	Cube(int num)
	{
		this.num=num;
	}
		public void run(){
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(" ");
				}
			square=num*num*num;
			System.out.println(num+" Square is "+square);
			
		
	}
}


public class Main {

	public static void main(String[] args) {
		Random2 r2= new Random2();
		r2.start();
	}

}
