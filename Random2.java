import java.util.*;
public class Random2 extends Thread{
	int val;
	int limit=1000;
	Random r=new Random();
	public void run(){
		while(true){
	try{
	Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
	val = r.nextInt(1000);
	System.out.println(val);
	if(val%2==0)
	{
		new Square(val).start();
	}
	else
	{
		new Cube(val).start();

	}
	}
}
}
