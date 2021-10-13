package hu.petrik;

public class Teglalap extends Sikidom {
    private double a, b;

    @Override
    protected double keruletSzamitas() {
        return 2*(a+b);
    }

    @Override
    protected double teruletSzamitas() {
        return a * b;
    }

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Teglalap() {
        this.a = veletlenHossz();
        this.b = veletlenHossz();
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap { a = %f; b = %f; %s}", a, b, super.toString());
    }
}
