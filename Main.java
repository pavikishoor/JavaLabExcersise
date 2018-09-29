
import java.io.File;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter File Path With Name And Exit");
		String fpath =new Scanner(System.in).nextLine();
		File afile =new File(fpath);
		
		if(afile.exists()){
			System.out.println("File is Available");
		if(afile.canRead())
			System.out.println("File Readable");
		if(afile.canWrite())
			System.out.println("File Writeable");
		System.out.println(afile.getName());
		System.out.println("File Size "+afile.length()+" Bytes ");
	}else
	{
		System.out.println("FILE NOT fOUND");
	}
	}
}
