import Entities.Animal;
import Entities.Dog;
import Entities.Washer;

public class Main {
    public static void main(String[] args) {
        /*
        Animal bobby = new Dog("Bobby","crockets", 5,"Canine");
        System.out.println(bobby.feed());
        System.out.println(bobby.getName());
        */

        Washer newWahser = new Washer();
        newWahser.setConsumption('L');
        System.out.println(newWahser.toString());
        newWahser.createWasher("pink",45,'d',49);
        System.out.println(newWahser.toString());
        newWahser.finalPrice();
        System.out.println(newWahser.toString());
    }
}