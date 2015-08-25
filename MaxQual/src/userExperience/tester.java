package userExperience;

import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class tester{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//String wxpName = "Jim\\Engage Just Total Brutal";
		/*String wxpName1 = "Brian" + "\\" + "3dTrafficBrian" + ".wwks";
		System.out.println(wxpName1);
		wxpName1 = '"'+ wxpName1 + '"';
		System.out.println(wxpName1);
		RegReader reg = new RegReader();
		reg.setHitDir(wxpName1);
		System.out.println(reg.getHitDir());
		StopwatchTimer t = new StopwatchTimer();
		Application brian = new Application(wxpName1);*/
		
		
		/*ArrayList <String> commands = new ArrayList<String>();
		commands.add("REG");
		commands.add("QUERY");
		commands.add("HKLM\\SOFTWARE\\WSI\\GIS\\1.0");
		commands.add("/v");
		commands.add("Version");
		ProcessBuilder p = new ProcessBuilder(commands);
		for (String s: commands){
			System.out.println(s);
		}
		try {
			p.start();
			p.redirectErrorStream(true);
			System.out.println(p.redirectOutput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//setup - install reg key to set default path for Roadbuilder Scene folder
		
		RoadBuilder rb = new RoadBuilder();
		String imgSrc = "C:\\UIautoImages\\UIImages\\RoadBuilder\\Open\\";
		String lookFor = "RB_is_open.JPG";
		String lookIn = "Whole_UI_Open.JPG";
		String whatToLookFor = imgSrc + lookFor;
		String whereToLook = imgSrc + lookIn;
		//System.out.println(rb.getApplication().waitForAppear(imgPath));
		System.out.println(rb.getApplication().waitForAppear(whereToLook, whatToLookFor,"DigitalMedia"));
		
		//rb.getApplication().regionLocation();
		
		//Region b = new Region(604,382,215,42);
		//b.highlight(3);
		//Screen s = new Screen();
		//ScreenImage sc = s.capture(b);
		//rb.getApplication().compareImage(sc.getImage(), img1)

	}
}
