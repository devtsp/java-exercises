package ShipRent.services;

import ShipRent.entities.Ship;

public class ShipRent extends Rent{

    public ShipRent() {};

    public ShipRent(String name, int id, String rentStart, String rentEnd) {
        super(name, id, rentStart, rentEnd);
    }

    public float calculateShipRent(Ship ship) {
        float result = 0;
        float module = ship.getLength() * 10;
        float days = super.calculateDays(this.getRentStart(), this.getRentEnd());
        result = days * module;

        return result;
    }


}
