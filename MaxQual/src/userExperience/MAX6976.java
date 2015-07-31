package userExperience;
import org.sikuli.script.*;

public class MAX6976 {

	public static void main(String[] args) {
		
		Screen s = new Screen();
		//s.wait(2.0);
		//s.type("n",KeyModifier.CTRL); // New content
		//s.wait(2.0);
		//egionLocation();
		try {
			//s.click(new Region(1026,600,145,23)); //Click New Earth Scene 
			//s.wait(10.0);
		//	for(int i = 0; i > 4;i++){
			//s.click(new Region(66,17,33,25)); //Go To Add Menu
			//s.wait(2.0);
			//s.click(new Region(66,805,33,25)); //Add Sky 
			//s.wait(10.0);
			//s.type(Key.DELETE);
			//s.wait(2.0);
			//System.out.println("end loop");
		//	}
			s.wait(1.0);
			s.type(KeyModifier.ALT,Key.F4);
			s.wait(1.0);
			s.click(new Region(1026,600,145,23));
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
