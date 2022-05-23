package ApplianceStore.entities;

public class Washer extends Appliance {
  private int capacity;

  public Washer() {
  }

  public Washer(
      String color,
      char consumption,
      int weight,
      int capacity) {
    super(
        color,
        consumption,
        weight);
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void createWasher(
      String color,
      char consumption,
      int weight,
      int capacity) {
    super.createAppliance(color, consumption, weight);
    this.capacity = capacity;
  }

  @Override
  public void finalPrice() {
    super.finalPrice();
    if (this.capacity > 30) {
      this.price += 500;
    }
  }

  @Override
  public String toString() {
    return "Washer{" +
        "capacity=" + capacity +
        ", price=" + price +
        ", color='" + color + '\'' +
        ", consumption=" + consumption +
        ", weight=" + weight +
        '}';
  }
}
