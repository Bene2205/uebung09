package ueb09.fz;

public class Fahrrad extends OhneMotor{
	private String modell;
	private int gaenge;
	private boolean ruecktrittbremse;
	private Cantileverbremse[] bremsen;

	public Fahrrad(String hersteller, String modell, int gaenge, boolean ruecktrittbremse) {
		super(hersteller, modell);
		this.gaenge = gaenge;
		this.ruecktrittbremse = ruecktrittbremse;
		this.bremsen = new Cantileverbremse[] { new Cantileverbremse(), new Cantileverbremse() };
	}

	public String toString() {
		return getType()
				+ gaenge + " Gängen"
				+ (ruecktrittbremse ? ", Rücktrittbremse" : "")
				+ " und " + bremsen.length + " " + bremsen[0].toString();
	}
}
