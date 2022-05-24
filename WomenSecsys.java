//implementing package and interface concept in miniproject
package miniproject;

interface Details{
	void name();
	void address();
	void phonenumber();
	void workingplace();
}
//creating a abstract class that implements interface
abstract class Newclass implements Details{
	public void address() {
		System.out.println("No:14,Annai shree meenakshi nagar, ponmeni , Madurai");
	}	
}
class NewClass1 extends Newclass{
	public void name() {
		System.out.println("Suganthi");
		}
	public void phonenumber() {
		System.out.println("Phonenumber :1234567890");
		}
	public void workingplace() {
		System.out.println("combiture");
		}
}
/*class print {
public void printdetail() {
	System.out.println("User Details: ");
	Details d = new NewClass1();
	d.name();
	d.address();
	d.phonenumber();
	d.workingplace();
}
}*/
public class WomenSecsys {
	public void printdetail() {
		System.out.println("User Details: ");
		Details d = new NewClass1();
		d.name();
		d.address();
		d.phonenumber();
		d.workingplace();
	}
	public static void main(String args[]) {
		WomenSecsys p = new WomenSecsys();
		p.printdetail();
	}
}

/*
interface Details{
	void detail();
}
class User_1{
	String name;
	String address;
	int phonenumber;
	String workingplace;
//creating a constructor
User_1(String n,String a,int p,String w){
	name = n;
	address = a;
	phonenumber = p;
	workingplace = w;
}
//displaying the contents
void display() {
	System.out.println("User Details: ");
	System.out.println("Name of the user: "+name);
	System.out.println("Address of the user: "+address);
	System.out.println("Phone number of the user: "+phonenumber);
	System.out.println("Working place of the user: "+workingplace);
}
}

class Print extends User_1 implements Details{
	Print(String n,String a,int p,String w){
		super(n,a,p,w);
	}
	void display() {
		super.display();
	}
}

class WomenSecsys{
	public static void main(String args[]) {
		Print p = new Print("Suganthi","ponmeni","1","combiture");
		P.display();
		
	}
}
*/