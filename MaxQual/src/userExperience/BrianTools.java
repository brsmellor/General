package userExperience;

import org.sikuli.script.*;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public interface BrianTools {
	

	
	default void regionLocation(){
		Screen s = new Screen();
		Rectangle rec = s.selectRegion().getRect();
		System.out.println(rec.toString());
	}
	
	default double compareImage(BufferedImage img0, BufferedImage img1) {
		double p = 0.0;
		long diff = 0;
		if(img0.getWidth() == img1.getWidth() && img0.getHeight() == img1.getHeight()){
			for(int x = 0; x < img0.getWidth(); x++){
				for(int y = 0; y < img0.getHeight(); y++){
					int rgb0 = img0.getRGB(x,y);
					int rgb1 = img1.getRGB(x,y);
					int r0 = (rgb0 >> 16) & 0xff;
					int g0 = (rgb0 >>  8) & 0xff;
					int b0 = (rgb0      ) & 0xff;
					int r1 = (rgb1 >> 16) & 0xff;
					int g1 = (rgb1 >>  8) & 0xff;
					int b1 = (rgb1      ) & 0xff;
					diff += Math.abs(r0 - r1);
					diff += Math.abs(g0 - g1);
					diff += Math.abs( b0 - b1);
				}
			}
			double n = img0.getWidth() * img0.getHeight() * 3;
			p = diff / n / 255.0;
			//System.out.println("diff precent: " + (p * 100.0));
		}else{
			System.out.println("images differ in w and h");
	//		return false;
		}
		return p *100;
	}



	default Region makeRegionFromImage(String imgPath) {
		BufferedImage img = createBufferedImage(imgPath);
	
			System.out.println("Dimentions of image: " + img.getWidth() + "," + img.getHeight());
			Region r = new Region(0,0,img.getWidth(),img.getHeight());
			return  r;
	}
	
	default BufferedImage createBufferedImage(String imgPath){
		BufferedImage img = null;
		try{
			img = ImageIO.read(new File(imgPath));
		}
		catch (IOException e){
			System.out.println("Could not read " + imgPath);			
		}
		return img;
		
	}
	
	default boolean waitForAppear(String imgPath){
		Region s = new Region(makeRegionFromImage(imgPath));
		System.out.println("highlight where you are looking");
		s.highlight(2);
		try {
			s.wait(new Pattern(createBufferedImage(imgPath)));
			return true;
		} catch (FindFailed e) {
			System.out.println("Could not find: " + imgPath + " On screen.");
			e.printStackTrace();
			return false;
		}
		
	}
}