package userExperience;

import org.sikuli.script.*;

public class User {
	
	private String workspace;
	private Region r;
	private App max;
	private Screen s;

	private static String maxPath = "WSI\\TruVu MAX\\Bin\\";
	private static String progFiles = "C:\\Program Files\\";
	private static String tvmToolPath = "WSI\\TruVu MAX Internal Tools\\Bin\\";
	private String appName; 
	
	public User(String workspace){
		this.appName = "Azulone.exe";
		this.workspace = workspace;
		max = App(startMaxPath());
		r = createIntRegion();
		r.highlight(2);
		s = new Screen();
		max.open();
	}
	
	public User(int whichApp){ // Which other max type application would you like to lauch.
		max = App(startApplicationString(whichApp));
		r = createIntRegion();
		r.highlight(2);
		s = new Screen();
		max.open();
		
	}

	private String startApplicationString(int whichApp) {
		String startString;
		switch (whichApp){
		case 1:
			this.setAppName("DriveTimeConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
		case 2:
			this.setAppName("PlaceConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
		case 3: 
			this.setAppName("SiteSelector.exe");
			startString = progFiles + maxPath + getAppName();
		case 4:
			this.setAppName("StyleGuideEditor.exe");
			startString = progFiles + maxPath + getAppName();
		case 5:
			this.setAppName("VideoConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
		case 6:
			this.setAppName("RoadBuilder.exe");
			startString = progFiles + tvmToolPath + getAppName();
		case 7:
			this.setAppName("ImportMedia.exe");
			startString = progFiles + maxPath + getAppName();
		default :
			this.setAppName("Azulone.exe");
			startString = progFiles + maxPath + getAppName();
		}
		
		
		return startString;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	private Region createIntRegion() {
		Region r = new Region(0,0,1920,1200);
		return r;
	}

	private App App(String startMaxString) {
		App max = new App(startMaxString);
		return max;
	}

	private String startMaxPath() {
		
		return progFiles + maxPath + " " + "-workspace" + " " + getWorkspace();
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}
	
	public Region getRegion(){
		return r;
	}
	public void setRegion(Region reg){
		this.r = reg;
	}
	
	public void closeApp(){
		this.max.close();
	}
	
	public Screen getScreen(){
		return s;
	}
	
	
}
