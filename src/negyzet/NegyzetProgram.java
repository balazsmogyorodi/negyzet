package negyzet;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }

    private void feladat() {
        Negyzet negyzet = new Negyzet();
        Koordinata koordinata = new Koordinata();
        negyzet.setHossz(2);
        koordinata.setX(20);
        koordinata.setY(30);

        System.out.println(negyzet.allapot());
    }

}
