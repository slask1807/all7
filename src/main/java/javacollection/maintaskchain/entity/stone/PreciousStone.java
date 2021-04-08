package javacollection.maintaskchain.entity.stone;


import javacollection.maintaskchain.enums.Color;
import javacollection.maintaskchain.enums.PreciousStoneType;

public class PreciousStone extends Stone {

    private PreciousStoneType name;

    public PreciousStone() {
        super();
    }

    public PreciousStone(double weight, double price, Color color, PreciousStoneType name) {
        super(weight, price, color);
        this.name = name;
    }

    public PreciousStoneType getName() {
        return name;
    }

    public void setName(PreciousStoneType name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "\nPreciousStone{" +
                "name = " + this.getName() +
                ", color = " + this.getColor() +
                ", weight = " +  String.format("%8.3f",this.getWeight()) +
                ", price = " +  String.format("%8.2f",this.getPrice()) +
                '}';
    }
}


