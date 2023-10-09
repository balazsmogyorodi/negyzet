package negyzet;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }

    private void feladat() {
        Koordinata k = new Koordinata(20, 30);
        Negyzet negyzet = new Negyzet(4, k);
        System.out.println(negyzet.allapot());
    }

}
