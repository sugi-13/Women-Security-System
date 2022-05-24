//implementing threads in mini project
//sending messages to the saved contact like in safe or danger 
package miniproject;
import java.util.Scanner;

/*
 class Person1 extends Thread{
 
	public void message() {
		System.out.println("to person 1");
		//this.sleep(1000);
	}
}
class  Person2 extends Thread{
	public void message() {
		System.out.println("to person 2");
		//this.sleep(500);
	}
}
public class WomenssThreads {
	public static void main(String args[]) {
	/*String input = " ";
	Scanner sc = new Scanner(System.in);
	input = sc.nextLine();*/
	//Person1 p1 = new Person1();
	//Person2 p2 = new Person2();
	//p1.start();
	//System.out.println(input);
	//p2.start();
	//System.out.println(input);	
//}
//}
class Simple1 extends Thread{  
	 public void run(String input){  
	   System.out.println(input);  
	 }  
	}  
	  
	class Simple2 extends Thread{  
	 public void run(String input){  
	   System.out.println(input);  
	 }  
	}  
	  
	 class WomenssThreads{  
	 public static void main(String args[]){ 
		 String input;
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
	  Simple1 t1=new Simple1();  
	  Simple2 t2=new Simple2();  
	  
	  t1.start();  
	  t2.start();  
	 }  
	} 

