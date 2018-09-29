import java.util.ArrayList;
import java.util.Scanner;

class StringList{
	ArrayList<String> aList;
	public StringList(){
		aList = new ArrayList<String>();
	}
	void appendString(String data){
		aList.add(data);
		display();
	}
	void insertInto(String data,int Position){
		aList.add(Position,data);
		display();
	}
	void SearchString(String data){
		
		boolean isFound = false;
		for(String aString: aList){
			if(aString.equalsIgnoreCase(data)){
				isFound = true;
			    break;
		}
		}
			
	if(isFound)
		System.out.println(data+"Is Found");
	else 
		System.out.println(data+"Not Found ");
		
	}
	void ListStrings(char aChar){
		for(String aString: aList){
			char fchar =aString.charAt(0);
			if ( fchar== aChar)
				System.out.println(aString);
	}
	}
	void display(){
		System.out.println("String Added");
		for(String ele: aList);
	}
}
public class Main {

	
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		StringList sl = new StringList();
		//int choice;
		//System.out.println("Enter your Choice ");
		//choice=s.nextInt();
		//switch(choice){
		//case 1:
			sl.appendString("Apple");
		//case 2:
			sl.insertInto("Orange",1);
		//case 3:
			sl.SearchString("Apple");
		//case 4:
			sl.ListStrings('A');
		}
	}

//}
