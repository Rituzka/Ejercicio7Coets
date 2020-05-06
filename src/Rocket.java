import java.util.ArrayList;
import java.util.List;

public class Rocket {

	private String code;
	private int numThrusters;
	private List<Integer> maxPower = new ArrayList<Integer>();
	int numThruster = 1;

	public Rocket(String code, int numThrusters, List<Integer> maxPower) {

		this.code = code;
		this.numThrusters = numThrusters;
		this.maxPower = maxPower;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumThrusters() {
		return numThrusters;
	}

	public void setNumThrusters(int numThrusters) {
		this.numThrusters = numThrusters;
	}

	public List<Integer> getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(List<Integer> maxPower) {
		this.maxPower = maxPower;
	}

	public String printMaxPowerThrusters(List<Integer> listMaxPower) {
		maxPower = listMaxPower;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listMaxPower.size(); i++) {
			sb.append(String.valueOf(listMaxPower.get(i)));
			if (i < listMaxPower.size() - 1)
				sb.append(", ");
		}

		return sb.toString();
	}

	public void accelerating(List<Integer> maxPower) {
		this.maxPower = maxPower;

		for (int i = 1; i < maxPower.size(); i++) {
			numThruster = i;
			System.out.println("Starting acceleration thruster " + i);

			for (int j = 0; j < maxPower.get(i); j++) {
				System.out.print(j + " - ");
				if (j == maxPower.get(i) - 1) {
					braking(j);
				}
			}

		}

	}

	public void braking(int maximum) {

		System.out.println("Thruster at maximum capacity" + "\n");
		System.out.println("Deceleration process started");

		for (int i = maximum; i > 0; i--) {
			System.out.print(i + " - ");

		}
	}

}
