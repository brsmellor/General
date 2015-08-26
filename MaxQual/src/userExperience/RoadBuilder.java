package userExperience;

import org.sikuli.script.*;
import java.io.File.*;

public class RoadBuilder{
	
	private Region menuBar;
	private Region buildButtons;
	private Region roadBuilderTab;
	private Region earthTab;
	private Region roadBuilderUI;

	private Application app;
	
	public RoadBuilder(){
		this.app = new Application(6);
		//this is something to update the file
	}
	
	public Screen getScreen(){
		Screen s = this.app.getScreen();
		return s;
	}
	
	public Region getRegion(){
		Region r = this.app.getRegion();
		return r;
	}
	public Application getApplication(){
		Application a = this.app;
		return a;
	}

	public void setMenuBar(Region menuBar) {
		this.menuBar = menuBar;
	}

	public void setBuildButtons(Region buildButtons) {
		this.buildButtons = buildButtons;
	}

	public void setRoadBuilderTab(Region roadBuilderTab) {
		this.roadBuilderTab = roadBuilderTab;
	}

	public void setEarthTab(Region earthTab) {
		this.earthTab = earthTab;
	}
	
	public void setRoadBuilderUI(Region roadBuilderUI) {
		this.roadBuilderUI = roadBuilderUI;
	}
	

}
