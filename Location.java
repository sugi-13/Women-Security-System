package miniproject;
import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/*public class Location {
	 public static void main(String args[]) {  
		 try {
		      File myObj = new File("E:\\Location.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
	 }      

}
*/
class Loc_detail{
	double time;
	String address;
	public Loc_detail(double time,String address) {
		this.time=time;
		this.address=address;
	}
}
class locate {
	void loc(){
	ArrayList<Loc_detail> a = new ArrayList<Loc_detail>();
	Loc_detail l1 = new Loc_detail(8.15,"Anna nagar");
	Loc_detail l2 = new Loc_detail(9.02,"Madakulam");
	Loc_detail l3 = new Loc_detail(9.45,"Madakulam");
	Loc_detail l4 = new Loc_detail(5.25,"Ponmeni");
	Loc_detail l5 = new Loc_detail(10.01,"Ponmeni");
	a.add(l1);
	a.add(l2);
	a.add(l3);
	a.add(l4);
	a.add(l5);
	System.out.println("Recently visited locations :");
	for(Loc_detail l:a) {
		System.out.println(l.time+" "+l.address);
	}
	}
}
public class Location{
	public static void main(String args[]) {
		locate l = new locate();
		l.loc();
	}
}