package max7169;

import java.awt.image.BufferedImage;

import org.sikuli.script.*;

public class Max7169 {
	
	private static long time0;
	private static long time1;
	private static boolean stop = false;
	private static long waitTime = 3000;
	private static ScreenImage image0;
	private static ScreenImage image1;
	private static int x = 974, y = 238, w = 928, h = 526;

	public static void main(String[] args) {
		
		Region showPlayer = new Region(x,y,w,h);
		
		System.out.println("set time0 and time1");
		setTime0();
		setTime1();
		System.out.println("enter while loop");
		while(!stop){
			if(startCheck()){
				setImage0(showPlayer);
				setImage1(showPlayer);
				if(lostFlowData(compareImage())){
					System.out.println("Lost flow data");
					break;
				}
				setTime1();
			}
			setTime0();
		}
	}

	private static boolean lostFlowData(double d) {
		if(d >= 90.0){
			return true;
		}
		return false;
	}

	private static double compareImage() {
		BufferedImage img0 = getImage0().getImage();
		BufferedImage img1 = getImage1().getImage();
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

	private static void setImage0(Region r) {
		Screen s = new Screen();
		r.highlight(2);
		image0 = s.capture(r);
		
		
	}
	
	private static void setImage1(Region r){
		Screen s = new Screen();
		r.highlight(2);
		image1 = s.capture(r);
	}
	
	private static ScreenImage getImage0(){
		return image0;
	}
	
	private static ScreenImage getImage1(){
		return image1;
	}

	private static void setTime1() {
		time1 = time0;
		
	}

	private static boolean startCheck() {
		boolean go;
		if ((time0 - time1) >= waitTime)
		{
			go = true;
		}
		else{
			go = false;
		}
			
		return go;
	}
	
	private static void setTime0(){
		
		time0 = System.currentTimeMillis();
	}
	
}