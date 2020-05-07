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

	public synchronized void accelerating(List<Integer> maxPower) {

		for (int i = 0; i < maxPower.size(); i++) {
			System.out.println("Acceleration Thruster " + (i + 1) + " starts");
			for (int j = 1; j < maxPower.get(i); j++) {
				System.out.print(j + " - ");
				if (j == maxPower.get(i) - 1) {

					braking(j, numThruster);

				}

				numThruster = i + 1;
			}
		}

	}

	public void braking(int maximum, int numThruster) {

		System.out.println("Thruster " + numThruster + " at maximum capacity");
		System.out.println("Deceleration thruster " + numThruster);

		for (int i = maximum; i > 0; i--) {
			System.out.print(i + " - ");

		}
		System.out.println("");
		
	}

}
