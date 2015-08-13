package userExperience;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

import java.lang.ProcessBuilder;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class tester {

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
		User brian = new User(wxpName1);
		*/
		
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
		String imgName = "Whole_UI_Open.JPG";
		String imgPath = imgSrc + imgName;
		
		Region r = makeClickRegionFromImage(imgPath);
		r.highlight(2);
		
		
		
		
	}

	private static Region makeClickRegionFromImage(String imgPath) {
		BufferedImage img = null;
		try{
			img = ImageIO.read(new File(imgPath));
		}
		catch (IOException e){
			System.out.println("Could not read " + imgPath);			
		}
		
		System.out.println("Dimentions of image: " + img.getWidth() + "," + img.getHeight());
		Region r = new Region(0,0,img.getWidth(),img.getHeight());
		return  r;
		
	}

}
