package userExperience;

import org.sikuli.script.*;

public class Application implements BrianTools{
	
	private String workspace;
	private Region r;
	private App max;
	private Screen s;

	private static String maxPath = "WSI\\TruVu MAX\\Bin\\";
	private static String progFiles = "C:\\Program Files\\";
	private static String tvmToolPath = "WSI\\TruVu MAX Internal Tools\\Bin\\";
	private String appName; 
	
	public Application(String workspace){
		this.appName = "Azulon.exe";
		this.workspace = workspace;
		System.out.println(startMaxPath());
		max = App(startMaxPath());
		System.out.println(max.getName() + " --From max.getName");
		r = createIntRegion();
		r.highlight(2);
		s = new Screen();
		max.open();
	}
	
	public Application(int whichApp){ // Which other max type application would you like to launch.
		max = App(startApplicationString(whichApp));
		r = createIntRegion();
		//r.highlight(2);
		s = new Screen();
		max.open();
		
	}

	private String startApplicationString(int whichApp) {
		String startString;
		switch (whichApp){
		case 1:
			this.setAppName("DriveTimeConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		case 2:
			this.setAppName("PlaceConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		case 3: 
			this.setAppName("SiteSelector.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		case 4:
			this.setAppName("StyleGuideEditor.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		case 5:
			this.setAppName("VideoConfiguration.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		case 6:
			this.setAppName("RoadBuilder.exe");
			startString = progFiles + tvmToolPath + getAppName();
			break;
		case 7:
			this.setAppName("ImportMedia.exe");
			startString = progFiles + maxPath + getAppName();
			break;
		default :
			this.setAppName("Azulon.exe");
			startString = progFiles + maxPath + getAppName();
			break;
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
		System.out.println(startMaxString + "From private App");
		App max = new App(startMaxString);
		return max;
	}

	private String startMaxPath() {
		String startString =  progFiles + maxPath + getAppName() +" " + "-workspace" + " " + getWorkspace();
		System.out.println(startString + " --From startMaxPath()");
		return startString;
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
