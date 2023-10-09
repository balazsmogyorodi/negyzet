package negyzet;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();

    }

    private void feladat() {
        Negyzet negyzet = new Negyzet();
        
        negyzet.setHossz(2);
        
        System.out.println(negyzet.allapot());
    }
}
