
package negyzet;


class Negyzet {
  private  int x, y, hossz;
    
    
    
    
    
    public int terulet(){
        setHossz(2);
        return hossz*hossz;
    }

    public int getX() {
        setX(5);
        return x;
    }

    public int getY() {
        setY(9);
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }
    
    
       
    
    
    
    
}
