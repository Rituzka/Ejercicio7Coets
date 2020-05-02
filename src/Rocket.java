
public class Rocket {

	private String code;
	private int numThrusters;
	private int[] maxPower;

	public Rocket(String code, int numThrusters, int[] maxPower) {

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

	public int[] getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int[] maxPower) {
		this.maxPower = maxPower;
	}

	public String printMaxPowerThrusters(int[] array) {
		maxPower = array;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			sb.append(String.valueOf(array[i]));
			if (i < array.length - 1)
				sb.append(", ");
		}

		return sb.toString();
	}

}
