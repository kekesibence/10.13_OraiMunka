package hu.petrik;

public class Haromszog extends Sikidom{
    private double a, b, c;

    public Haromszog(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Haromszog() {
        double a = veletlenHossz();
        double b = veletlenHossz();
        double c = veletlenHossz();
        while(!szerkeszthetoE(a, b, c)) {
            a = veletlenHossz();
            b = veletlenHossz();
            c = veletlenHossz();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static boolean szerkeszthetoE(double a, double b, double c) {
        return c <= a + b && b <= a + c && a <= b + c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    protected double keruletSzamitas() {
        return a+b+c;
    }

    @Override
    protected double teruletSzamitas() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög { a = %f; b = %f; c = %f, %sN", a,b,c,super.toString());
    }
}
