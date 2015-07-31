package userExperience;

import org.sikuli.script.*;

public class User {
	
	private String workspace;
	private Region r;
	private App max;
	private Screen s;

	static String maxPath = "C:\\Program Files\\WSI\\TruVu MAX\\Bin\\Azulon.exe";
	
	public User(String workspace){
		this.workspace = workspace;
		max = App(startMaxPath());
		r = createIntRegion();
		r.highlight(2);
		s = new Screen();
		max.open();
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
		
		return maxPath + " " + "-workspace" + " " + getWorkspace();
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
