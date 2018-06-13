package ueb09.fz;

public class Fahrzeug {
    private String hersteller,
                    modell;

    public Fahrzeug(String hersteller, String modell) {
        this.hersteller = hersteller;
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public String getType() {
        return "Ich bin ein " + hersteller + " " + modell + " mit ";
    }

}
