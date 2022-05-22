import java.util.ArrayList;

import Entities.*;

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

    ArrayList<Appliance> appliances = new ArrayList<>();
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

    Circle circle = new Circle(2.3);
    Square square = new Square(1.1,3.6);

    System.out.println(circle.calculateArea());
    System.out.println(circle.calculatePerimeter());
    System.out.println(square.calculateArea());
    System.out.println(square.calculatePerimeter());


  }

}