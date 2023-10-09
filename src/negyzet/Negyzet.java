package negyzet;

class Negyzet {

    private int x, y, hossz;

    public int terulet() {
        return hossz * hossz;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHossz(int hossz) {
        if (hossz <= 0){
        hossz = 1;
        }
        this.hossz = hossz;
    }

    public String allapot(){
        String allapot = "";
        allapot = "Négyzet x kooridnátája:" + x + "\nNégyzet y koordinátája:" + y + "\nterülete: " + terulet();

        return allapot;

    }

}
