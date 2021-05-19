package javacleancode.planes;

import javacleancode.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    private MilitaryType type;

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
