package negyzet;

class Negyzet {

    private int hossz;
    private Koordinata kord;

    public Negyzet(int hossz, Koordinata kord) {
        this.hossz = hossz;
        this.kord = kord;
    }

    public int terulet() {
        return hossz * hossz;
    }

    public void setHossz(int hossz) {
        if (hossz <= 0) {
            hossz = 1;
        }
        this.hossz = hossz;
    }

    public String allapot() {
        String allapot = "";
        allapot = "Négyzet x kooridnátája:" + kord.getX() + "\nNégyzet y koordinátája:" + kord.getY() + "\nterülete: " + terulet();
        return allapot;

    }

}
