package miniproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/*public class QuickText {
	public static void main(String[] args) {
        
        try {
            // Construct data
            String apiKey = "apikey=" + "NTYzODZhNDc1NDY0NzU0Yjc0NDc0ODMxNTk1MzRlNjE=";
            String message = "&message=" + "From SheSafe Reached safely";
            String sender = "&sender=" + "TXTLCL";
            String numbers = "&numbers=" + "9487178783";
 
            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
             
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer.toString());
            rd.close();
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}*/

public class QuickText{
	public void text(){
		int x;
		while(true) {
		System.out.println("***choose your text***\n1 for Iam Safe\n2 for In danger\n3 for suspicious\n4 for quit");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x==1) {
			System.out.println("Iam safe");
		}
		else if (x==2) {
			System.out.println("Iam in danger");
		}
		else if (x==3) {
			System.out.println("Suspicious");
		}
		else {
			System.exit(0);
		}
		
	}
		}
	public static void main(String args[]) {
		QuickText t = new QuickText();
		t.text();
	
}
}


