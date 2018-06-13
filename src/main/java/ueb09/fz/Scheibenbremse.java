package ueb09.fz;

public class Scheibenbremse implements Bremse{
	private static final int MAX_RIEFENTIEFE = 4;
	private static final int MIN_BELAG = 1;
	private static final int MAX_BELAG = 8;

	private int riefentiefe;
	private int belag;

	public Scheibenbremse() {
		this.riefentiefe = 0;
		this.belag = MAX_BELAG;
	}

	@Override
	public void bremsen() {
		System.out.println("Scheibembremse bremst!");
	}

	@Override
	public boolean bremseOK() {
		return riefentiefe < MAX_RIEFENTIEFE && belag > MIN_BELAG;
	}

	@Override
	public String toString() {
		return "Scheibenbremse";
	}
}
