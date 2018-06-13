package ueb09.fz;

public class Trommelbremse implements Bremse{
	private int belag;
	private static final int MIN_BELAG = 2;
	private static final int MAX_BELAG = 8;

	public Trommelbremse() {
		this.belag = MAX_BELAG;
	}

	@Override
	public void bremsen() {
		System.out.println("Trommelbremse bremst!");
	}

	@Override
	public boolean bremseOK() {
		return belag < MIN_BELAG;
	}

	@Override
	public String toString() {
		return "Trommelbremse";
	}
}
