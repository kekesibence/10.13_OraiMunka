package hu.petrik;

public class Kor extends Sikidom {
    private double r;


    public Kor() {
        this.r = veletlenHossz();
    }

    public Kor(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }



    @Override
    protected double keruletSzamitas() {
        return 2 * r * Math.PI;
    }

    @Override
    protected double teruletSzamitas() {
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Kör: { Sugara = %f;  %s", r, super.toString());
    }
}
