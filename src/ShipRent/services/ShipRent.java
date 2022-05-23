package ShipRent.services;

import ShipRent.entities.Customer;
import ShipRent.entities.Ship;


public class ShipRent extends Rent{
    private Ship ship;
    public ShipRent(Customer customer,  String rentStart, String rentEnd, Ship ship) {
        super(customer, rentStart, rentEnd);
        this.ship = ship;
    }
    public ShipRent() {};

    public float calculateRent(Ship ship, int extraCosts) {
        return this.getDays() * ship.getLength() * 10;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
