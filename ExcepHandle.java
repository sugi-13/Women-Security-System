//implementing exception handling in java
package miniproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcepHandle {
public static void main(String args[]) {
	//invoking method
	UserDetails();
}
public static void UserDetails() {
	int line;
	int lc = 0;
	//try block
	try {
		System.out.println("User's contact details: ");
		FileReader fr = new FileReader("E:\\Usercontacts.txt");
		while((line = fr.read()) != -1){
			lc ++;
			System.out.print((char)line);
		}
		
	}
	//catch
	catch(FileNotFoundException fe){
		System.out.println("Error "+fe.getMessage());
	}
	catch(IOException i){
		System.out.println("Error "+i.getMessage());
	}
	//finally
	finally {
	 System.out.println(" ");
     System.out.println("Done !!");
	
}
}
}
