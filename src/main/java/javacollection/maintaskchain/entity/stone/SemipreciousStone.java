package javacollection.maintaskchain.entity.stone;

import javacollection.maintaskchain.enums.Color;
import javacollection.maintaskchain.enums.OpticalEffect;
import javacollection.maintaskchain.enums.SemipreciousStoneType;

public class SemipreciousStone extends Stone {

    private SemipreciousStoneType name;
    private OpticalEffect opticalEffect;

    public SemipreciousStone() {
        super();
    }

    public SemipreciousStone(double weight, double price, Color color, SemipreciousStoneType name, OpticalEffect opticalEffect) {
        super(weight, price, color);
        this.name = name;
        this.opticalEffect = opticalEffect;
    }

    public SemipreciousStoneType getName() {
        return name;
    }

    public void setName(SemipreciousStoneType name) {
        this.name = name;
    }

    public OpticalEffect getOpticalEffect() {
        return opticalEffect;
    }

    public void setOpticalEffect(OpticalEffect opticalEffect) {
        this.opticalEffect = opticalEffect;
    }

    @Override
    public String toString() {
        return "\nSemipreciousStone{" +
                "name = " + this.getName() +
                ", color = " + this.getColor() +
                ", opticalEffect = " + this.getOpticalEffect()+
                ", weight = " + String.format("%8.3f",this.getWeight()) +
                ", price = " +  String.format("%8.2f",this.getPrice()) +
                '}';
    }
}

