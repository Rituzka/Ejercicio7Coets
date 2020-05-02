import java.util.ArrayList;
import java.util.List;

public class Rocket {

	private String code;
	private int numThrusters;
	private List<Integer> maxPower = new ArrayList<Integer>();

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

}
