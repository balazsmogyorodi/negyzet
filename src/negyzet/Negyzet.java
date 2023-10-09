package negyzet;

class Negyzet {

    private int hossz;

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
        Koordinata kord = new Koordinata();
        kord.setX(20);
        kord.setY(30);
        String allapot = "";
        allapot = "Négyzet x kooridnátája:" + kord.getX() + "\nNégyzet y koordinátája:" + kord.getY() + "\nterülete: " + terulet();
        return allapot;

    }

}
