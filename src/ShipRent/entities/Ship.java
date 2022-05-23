package ShipRent.entities;

public abstract class Ship {
    private String license;
    private int length;
    private int fabricationYear;

    protected Ship(){};

    protected Ship(String license, int length, int fabricationYear) {
        this.license = license;
        this.length = length;
        this.fabricationYear = fabricationYear;
    }

    public int getLength() {
        return this.length;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
}
