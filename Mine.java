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

	System.out.println("Lamp is " + myLamp.isOn() 
	+ " and the color is " + myLamp.getColor()
	+ " and the wattage is " + myLamp.getWatts());
	
	Lamp yourLamp = new Lamp();
	Yours.print();
	
	Lamp otherLamp = new Lamp();
	Others.print();
	}
}
