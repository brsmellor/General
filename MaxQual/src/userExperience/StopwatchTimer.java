package userExperience;

public class StopwatchTimer {
	
	private final long start;
	
	public StopwatchTimer(){
		start = System.currentTimeMillis();
	}
	
	public double elapsedTime(){
		long now = System.currentTimeMillis();
		return (now - start )/1000.0;
	}

}
