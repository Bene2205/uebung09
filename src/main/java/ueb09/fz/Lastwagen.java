package ueb09.fz;

public class Lastwagen extends MitMotor{
	private int achsen;
	private int hubraum;
	private int maxNutzlast;
	private int zulGesamtGewicht;
	private Trommelbremse[] bremsen;

	public Lastwagen(String hersteller, String modell, int achsen, int ps, int hubraum, int tankvolumen, int maxNutzlast, int zulGesamtGewicht) {
		super(hersteller,modell,ps,tankvolumen);
		this.achsen = achsen;
		this.hubraum = hubraum;
		this.maxNutzlast = maxNutzlast;
		this.zulGesamtGewicht = zulGesamtGewicht;

		bremsen = new Trommelbremse[achsen * 2];
		for (int i = 0; i < bremsen.length; i++)
			bremsen[i] = new Trommelbremse();

	}

	public String toString() {
		return getType()
				+ getTypeInfo()
				+ achsen + " Achsen, "
				+ hubraum + " Hubraum, "
				+ maxNutzlast + " max. Nutzlast, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}
}
