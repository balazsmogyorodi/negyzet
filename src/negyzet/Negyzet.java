package negyzet;

class Negyzet {
    Koordinata koordinata = new Koordinata();
    private int hossz;

    public int terulet() {
        return hossz * hossz;
    }


    public void setHossz(int hossz) {
        if (hossz <= 0){
        hossz = 1;
        }
        this.hossz = hossz;
    }

    public String allapot(){
        String allapot = "";
        allapot = "Négyzet x kooridnátája:" + koordinata.getX() + "\nNégyzet y koordinátája:" + koordinata.getY() + "\nterülete: " + terulet();

        return allapot;

    }

}
