package userExperience;

import org.sikuli.script.*;

import java.awt.Rectangle;

public class BrianTools {

	public static void main(String[] args) {
		regionLocation();

	}
	
	private static void regionLocation(){
		Screen s = new Screen();
		Rectangle rec = s.selectRegion().getRect();
		System.out.println(rec.toString());
	}

}
