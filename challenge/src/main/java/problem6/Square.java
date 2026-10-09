package problem6;

public class Square extends Forme{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public double getSurface(){
        return Math.round(this.side*this.side*100.0)/100.0;
    }

    @Override
    public String toString() {
        return String.format("Square (side %.2f cm)",this.side);
    }
}
