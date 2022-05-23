package ShipRent.entities;

public class Sailboat extends Ship{
    private int poles;

    public Sailboat(){};

    public Sailboat(String license, int length, int fabricationYear, int poles) {
        super(license, length, fabricationYear);
        this.poles = poles;
    }

    public int getPoles() {
        return poles;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }
}
