package negyzet;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }

    private void feladat() {
        Negyzet negyzet = new Negyzet();
        negyzet.setHossz(2);
        Koordinata k = new Koordinata();
        k.setX(20);
        k.setY(30);
        negyzet.setKord(k);
        System.out.println(negyzet.allapot());
    }
}
