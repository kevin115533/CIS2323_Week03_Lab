import mystuff.*;
import lab2.*;

public class Mine{
	public static void main (String[] args){
		
	Lamp myLamp = new Lamp();	
	System.out.println("This is mine!");
	
	myLamp.setColor("white");
	myLamp.setWatts(45);
	myLamp.turnOn();
	System.out.println(myLamp.showStatus());

	Lamp yourLamp = new Lamp();
	Yours.print();
	
	yourLamp.setColor("red");
	yourLamp.setWatts(10000);
	yourLamp.turnOn();
	System.out.println(yourLamp.showStatus());
	
	Lamp otherLamp = new Lamp();
	Others.print();
	}
}
