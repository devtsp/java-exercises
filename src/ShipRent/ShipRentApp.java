package ShipRent;

import ShipRent.entities.Customer;
import ShipRent.entities.Sailboat;
import ShipRent.services.ShipRent;

public class ShipRentApp {
    public static void main(String[] args) {
        Sailboat sailboat1 = new Sailboat("ABC123",5,1983,2);
        Customer pepePapa = new Customer("Pepe Papa","34876217");
        ShipRent rent = new ShipRent(pepePapa, "23/05/2022","6/06/2022", sailboat1);
        System.out.println("CUSTOMER: " + rent.getCustomer().getName());
        System.out.println("SHIP: " + rent.getShip().getType());
        System.out.println("DAYS: " + rent.getDays());
        System.out.println("TOTAL RENT PRICE: $" + rent.calculateRent(sailboat1, sailboat1.getPoles()));
    }
}
