package ueb09.fz;

public class MitMotor extends Fahrzeug {
    private int ps;
    private int tankvolumen;

    public MitMotor(String hersteller, String modell, int ps, int tankvolumen) {
        super(hersteller, modell);
        this.ps  = ps;
        this.tankvolumen = tankvolumen;
    }

    public int getPs() {
        return ps;
    }

    public int getTankvolumen() {
        return tankvolumen;
    }

    public String getTypeInfo() {
        return " " + ps + " PS, " + tankvolumen + " Tankvolumen, ";
    }
}
