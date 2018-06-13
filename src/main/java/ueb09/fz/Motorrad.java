package ueb09.fz;

public class Motorrad extends MitMotor{
	private Scheibenbremse vorderbremse;
	private Trommelbremse hinterbremse;

	public Motorrad(String hersteller, String modell, int ps, int tankvolumen) {
		super(hersteller,modell,ps,tankvolumen);

		this.vorderbremse = new Scheibenbremse();
		this.hinterbremse = new Trommelbremse();
	}

	public void anlassen() {
		System.out.println("Starte Motor...");
	}

	public String toString() {
		return getType()
				+ getTypeInfo()
				+ " sowie einer " + vorderbremse + " und " + hinterbremse;
	}
}
