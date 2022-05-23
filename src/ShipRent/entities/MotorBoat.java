package ShipRent.entities;

public class MotorBoat extends Ship {
    private int power;

    public MotorBoat(){};

    public MotorBoat(String license, int length, int fabricationYear,int power) {
        super(license, length, fabricationYear);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}