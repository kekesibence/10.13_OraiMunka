package hu.petrik;

import java.util.Random;

public abstract class Sikidom {
    private final static Random rnd  = new Random();

    protected final double veletlenHossz() {
        return rnd.nextDouble() * 10 + 5;
    }
    protected abstract double keruletSzamitas();
    protected abstract double teruletSzamitas();


    @Override
    public String toString() {
        return String.format("K = %f; T = %f", keruletSzamitas(), teruletSzamitas());
    }
}
