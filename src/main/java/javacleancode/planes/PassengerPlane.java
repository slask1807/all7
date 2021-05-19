package javacleancode.planes;

import java.util.Objects;

public class PassengerPlane extends Plane {

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    private int passengersCapacity;

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                        '}');
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PassengerPlane)) return false;
//        if (!super.equals(o)) return false;
//        PassengerPlane plane = (PassengerPlane) o;
//        return passengersCapacity == plane.passengersCapacity;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
