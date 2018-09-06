package lab2;

public class StopWatch{
	private double start;
	private double stop;
	
	public void start(){
	start = System.nanoTime();
	}

	public void stop(){
	stop = System.nanoTime();
	}	

	public double time(){
	return ((stop-start) / 1000000.0);
	}
}