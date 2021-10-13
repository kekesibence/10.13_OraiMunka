package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Sikidom t1 = new Teglalap(4 ,6);
        System.out.println("Első téglalap A oldala" + ((Teglalap)t1).getA());

        Teglalap t2 = new Teglalap(6,9);
        System.out.println("Második téglalap A oldala: " + t2.getA());

        Kor k1 = new Kor();
        System.out.println("Első kör sugara: " + k1.getR());
        Kor k2 = new Kor(6);
        System.out.println("Második kör sugara: " +k2.getR());

        Haromszog h1 = new Haromszog();
        System.out.println("Első háromszög A oldala: " + h1.getA());
        System.out.println("Első háromszög B oldala: " + h1.getB());
        System.out.println("Első háromszög C oldala: " + h1.getC());
        Haromszog h2 = new Haromszog(8,8,8);
        System.out.println("Második háromszög A oldala: " + h2.getA());
        System.out.println("Második háromszög B oldala: " + h2.getB());
        System.out.println("Második háromszög C oldala: " + h2.getC());


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(h1);
        System.out.println(h2);

    }
}
