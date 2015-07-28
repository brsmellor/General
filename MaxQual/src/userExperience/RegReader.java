package userExperience;
//import jna to from registy settings 

public class RegReader {
	
	private String workspaceDir;
	private String hitDir;
	private String sceneDir;
	private boolean dynamicUnderclock;
	private String myTVC;
	private String mySkybase;
	
	

	public RegReader(){
		setSceneDir();
		setWorkspaceDir();
		setDynamicUnderclock(false);

	}

	public RegReader(boolean dynamicUnderclock){
		setSceneDir();
		setWorkspaceDir();
		setDynamicUnderclock(this.dynamicUnderclock);

	}

	private void setSceneDir() {
		sceneDir = "D:\\WSI\\DigitalMedia\\Custom\\Scenes";
		
	}

	public void setHitDir(String workspace) {
		int l = workspace.length();
		workspace = workspace.substring(1,l-6);
		hitDir = "D:\\WSI\\DigitalMedia\\Custom\\Defaults\\" + workspace + "\\Hits";
		
	}

	private void setWorkspaceDir() {
		workspaceDir = "D:\\WSI\\DigitalMedia\\Custom\\Workspace";
		
	}

	public String getWorkspaceDir() {
		return workspaceDir;
	}

	public String getHitDir() {
		return hitDir;
	}

	public String getSceneDir() {
		return sceneDir;
	}
	
	public boolean isDynamicUnderclock() {
		return dynamicUnderclock;
	}

	public void setDynamicUnderclock(boolean dynamicUnderclock) {
		if (dynamicUnderclock == false){
			this.dynamicUnderclock = dynamicUnderclock;
		}
		else{
			//apply regkey DWORD(32bit) for dynamicUnderclock to 1
		}
		
	}
	
	public String getMyTVC() {
		return myTVC;
	}
	public void setMyTVC(String myTVC) {
		//apply myTVC from registry
		this.myTVC = myTVC;
	}
	public String getMySkybase() {
		//apply mySkybase from registry
		return mySkybase;
	}
	public void setMySkybase(String mySkybase) {
		this.mySkybase = mySkybase;
	}

}
