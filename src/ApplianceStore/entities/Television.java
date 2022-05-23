package ApplianceStore.entities;

public class Television extends Appliance {
    private int resolution;
    private boolean tdt;

    public Television() {
    }

    public Television(
            String color,
            char consumption,
            int weight,
            int resolution,
            boolean tdt) {
        super(color, consumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;

    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean getTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void createTelevision(
            String color,
            char consumption,
            int weight,
            int resolution,
            boolean tdt) {
        super.createAppliance(color, consumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    @Override
    public void finalPrice() {
        this.price *= this.resolution > 40 ? 1.3 : 1;
        this.price += this.tdt ? 500 : 0;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolution=" + resolution +
                ", tdt=" + tdt +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", consumption=" + consumption +
                ", weight=" + weight +
                '}';
    }
}
