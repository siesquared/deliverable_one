package deliverable_one;

import java.util.Scanner;
public class menu {


static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
	
		
		// get user event
		System.out.println("What type of event are you hosting casual,semi-formal, or formal?");
		String  eventType = input.nextLine();
		
		//get user party size
		System.out.println("How many people?");
		int partySize = input.nextInt();
		
		String a1 = null;
		String a2 = null;
	
		//for party type
		if (eventType.equals("casual") ) {
			a1="sandwiches";
				
		} else if (eventType.equals("semi-formal")){
			a1=" fried chicken";	

		}else {
			a1=" chicken parm ";
			 
		//for party size 	 
		}
		if (partySize==1) { 
			a2=" in the microwave";
			
		} else if (partySize > 1 && partySize < 13){
			a2=" in your kitchen";
	
		}else {
			a2=" and call a caterer";
		
		}
		   
	   System.out.println( "If your're event is " + eventType + " for " + partySize + "  you should cook " + a1 + a2  );
	}  
	
}
