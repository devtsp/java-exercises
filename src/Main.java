import java.util.ArrayList;

import Entities.Animal;
import Entities.Appliance;
import Entities.Dog;
import Entities.Television;
import Entities.Washer;

public class Main {
  public static void main(String[] args) {
    Animal bobby = new Dog("Bobby", "crockets", 5, "Canine");
    System.out.println(bobby.feed());
    System.out.println(bobby.getName());

    Washer newWahser = new Washer("pink", 'd', 45, 49);
    Washer anotherWasher = new Washer("blue", 'a', 65, 25);
    Appliance newTv = new Television("black", 't', 20, 23, true);
    Television anoatherTv = new Television();
    anoatherTv.createTelevision("color", 'j', 40, 46, false);

    ArrayList<Appliance> appliances = new ArrayList<Appliance>();
    appliances.add(newWahser);
    appliances.add(anotherWasher);
    appliances.add(newTv);
    appliances.add(anoatherTv);

    int totalPrice = 0;
    for (Appliance a: appliances) {
      a.finalPrice();
      totalPrice += a.getPrice();
      System.out.println(a.getPrice());
    }
    System.out.println("TOTAL: $" + totalPrice);

  }

}