import java.util.ArrayList;
import java.util.List;

public class ControllerRocket {

	public static void main(String[] args) {

		List<Rocket> listRockets = new ArrayList<Rocket>();
		List<Integer> maxPowerRocket1 = new ArrayList<Integer>();
		
		maxPowerRocket1.add(10);
		maxPowerRocket1.add(30);
		maxPowerRocket1.add(80);
		
		List<Integer> maxPowerRocket2 = new ArrayList<Integer>();
		maxPowerRocket2.add(30);
		maxPowerRocket2.add(40);
		maxPowerRocket2.add(50);
		maxPowerRocket2.add(50);
		maxPowerRocket2.add(30);
		maxPowerRocket2.add(10);

		Rocket rocket1 = new Rocket("32WESSDS", 3, maxPowerRocket1);
		Rocket rocket2 = new Rocket("LDSFJA32", 6, maxPowerRocket2);

		listRockets.add(rocket1);
		listRockets.add(rocket2);

		// FASE 1
		System.out.println("------FASE 1 ----------" + "\n");
		for (int i = 0; i < listRockets.size(); i++) {
			System.out.println("Rocket " + (i + 1) + ": " + "Codigo: " + listRockets.get(i).getCode()
					+ " / Nro de propulsores: " + listRockets.get(i).getNumThrusters());

		}


		// FASE 2
		System.out.println("\n" + "------FASE 2 ----------" + "\n");

		for (int i = 0; i < listRockets.size(); i++) {

			System.out.println(listRockets.get(i).getCode() + ": " + listRockets.get(i).getNumThrusters()
					+ " propulsores: " + listRockets.get(i).printMaxPowerThrusters(listRockets.get(i).getMaxPower()));
		}
	}

}
