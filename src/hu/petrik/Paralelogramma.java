package hu.petrik;

public class Paralelogramma extends Sikidom {
    private double a;
    private double b;
    private double alpha;

    public Paralelogramma(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }

    public Paralelogramma() {
        this.a = veletlenHossz();
        this.b = veletlenHossz();
        this.alpha = Math.random() *180;
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }

    public double getAlpha() {
        return alpha;
    }

    @Override
    protected double keruletSzamitas() {
        return 0;
    }

    @Override
    protected double teruletSzamitas() {
        return 0;
    }
}
