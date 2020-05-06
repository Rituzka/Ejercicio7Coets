
public class InitiateThruster implements Runnable {
	
	Thread hilo;
	int maxPower;
	Rocket rocket;

	
	
	public InitiateThruster(String name,Rocket rocket, int maxPower){

		hilo = new Thread(this, name);
		this.maxPower = maxPower;
		this.rocket = rocket;
		
	}
	//method for creating threads
	public static InitiateThruster createThread(String name,Rocket rocket,  int maxPower) {
		
		
		InitiateThruster thread1 = new InitiateThruster(name, rocket, maxPower);
		thread1.hilo.start();
		return thread1;
	}
	;
	@Override
	public void run() {
		
		System.out.println("Thruster: "+hilo.getName()+" Initiate acceleration");
			rocket.accelerating(rocket.getMaxPower());
			
			
	}	

}
