import java.util.ArrayList;
import java.util.List;

public class InitiateThruster extends Thread {

Rocket rocket;
int maxPower;

public InitiateThruster(Rocket rocket, int maxPower) {
	this.rocket = rocket;
	this.maxPower = maxPower;
}

	@Override
	public void run() {

		rocket.accelerating(rocket.getMaxPower());

	}

}
