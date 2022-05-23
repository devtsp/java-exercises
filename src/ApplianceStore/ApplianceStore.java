package ApplianceStore;

import ApplianceStore.entities.Appliance;
import ApplianceStore.entities.Television;
import ApplianceStore.entities.Washer;

import java.util.ArrayList;

public class ApplianceStore {
    public static void main(String[] args) {
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


    }
}
