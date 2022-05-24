package miniproject;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.*; 

class EmergencyCall { 
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);   
    public void msg(){ 
        LOGGER.log(Level.WARNING, "connecting the call"); 
    } 

public void msg2() {
	LogManager lm = LogManager.getLogManager();        
    Logger log = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);   
    log.log(Level.INFO, "Ringing..."); 
}
}
public class Call {
	public static void main(String[] args){ 
		EmergencyCall obj = new EmergencyCall(); 
        obj.msg(); 
        obj.msg2();
    } 
}

