package miniproject;
import java.util.*;
import java.lang.*;
import java.util.logging.*;
public class WomenSecSystem {
	public static void main(String args[]) {
		while(true) {			
		System.out.println("******SheSafe********");
		Scanner sc = new Scanner(System.in);
		int c1;
		System.out.println("1.MyAccount");
		System.out.println("2.Dashboard");
		System.out.println("3.Exit");
		try {
			c1 = sc.nextInt();
			switch(c1) {
			case 1:
				//System.out.println("\n");
				System.out.println("******MyAccount******");
				System.out.println("1.Personal details");
				System.out.println("2.Emergency contacts");
				System.out.println("3.Exit");
				int c2;
				c2 = sc.nextInt();
				switch(c2) {
				case 1 :
					WomenSecsys ws = new WomenSecsys();
					ws.printdetail();					
					break;
				case 2 :
					ExcepHandle eh = new ExcepHandle();
					eh.UserDetails();
					break;
				case 3 :
					System.exit(0);
				default :
					System.out.println("Enter valid option");
				}
				break;
			case 2:
				System.out.println("******Dashboard******");
				System.out.println("1.Make a call");
				System.out.println("2.Record");
				System.out.println("3.Location");
				System.out.println("4.Quick text");
				System.out.println("5.Camera");	
				System.out.println("6.Exit");	
				int c3;
				c3 = sc.nextInt();
				switch(c3) {
				case 1 :
					EmergencyCall c = new EmergencyCall();
					c.msg();
					c.msg2();
					break;
				case 2 :
					AudioRecord recorder = new AudioRecord();
			        recorder.recordaudio();				
					break;
				case 3 :
					locate l = new locate();
					l.loc();
					break;
				case 4 :
					QuickText t = new QuickText();
					t.text();
					break;
				case 5 :
					CaptureImage d = new CaptureImage();
					d.startcapture();
					break;
				case 6 :
					System.exit(0);
				default :
					System.out.println("Enter valid option");
				}
				break;
			case 3 :
				System.exit(0);
			default :
				System.out.println("Enter valid option");
			}
		}
		catch (Exception e) {
			 // Display the exception along with line number using printStacktrace() method
            e.printStackTrace();
        }
	}
	}
}
