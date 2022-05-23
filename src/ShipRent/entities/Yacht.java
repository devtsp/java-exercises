package ShipRent.entities;

public class Yacht extends Ship{
    private int power;
    private int cabins;
    public Yacht(String license, int length, int fabricationYear, int power, int cabins) {
        super(license, length, fabricationYear);
        this.power =  power;
        this.cabins = cabins;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }
}
