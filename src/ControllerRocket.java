import java.util.ArrayList;
import java.util.List;

public class ControllerRocket {

	public static void main(String[] args) {

		List<Rocket> listRockets = new ArrayList<Rocket>();
		int[] maxPowerRocket1 = { 10, 30, 80 };
		int[] maxPowerRocket2 = { 30, 40, 50, 50, 30, 10 };

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

		for (Rocket v : listRockets) {
			for (int i = 0; i < v.getMaxPower().length; i++) {

			}
		}

		// FASE 2
		System.out.println("\n" + "------FASE 2 ----------" + "\n");

		for (int i = 0; i < listRockets.size(); i++) {

			System.out.println(listRockets.get(i).getCode() + ": " + listRockets.get(i).getNumThrusters()
					+ " propulsores: " + listRockets.get(i).printMaxPowerThrusters(listRockets.get(i).getMaxPower()));
		}
	}

}
