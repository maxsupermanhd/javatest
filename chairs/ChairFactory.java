package chairs;

public class ChairFactory implements AbstractChairFactory {
	public VictorianChair createVictorianChair() {
		VictorianChair c = new VictorianChair(15);
		return c;
	}
	public MagicChair createMagicChair() {
		MagicChair c = new MagicChair();
		return c;
	}
	public FunctionalChair createFunctionalChair() {
		FunctionalChair c = new FunctionalChair();
		return c;
	}
}
