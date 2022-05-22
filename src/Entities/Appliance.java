package Entities;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Appliance {
    protected int price;
    protected String color;
    protected char consumption;
    protected int weight;

    protected Appliance() {
    }

    protected Appliance(
            int price,
            String color,
            char consumption,
            int weight
    ) {
        this.price = price;
        this.color = color;
        this.consumption = validateConsumption(consumption);
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public char getConsumption() {
        return consumption;
    }

    public void setConsumption(char consumption) {
        this.consumption = validateConsumption(consumption);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private char validateConsumption(char letter) {
        char uppercaseChar = Character.toUpperCase(letter);
        char consumptionClass = 'F';
        char[] classes = {'A', 'B', 'C', 'D', 'E'};
        for (char c : classes) {
            if (uppercaseChar == c) {
                consumptionClass = uppercaseChar;
                break;
            }
            ;
        }
        return consumptionClass;
    }

    private String validateColor(String $color) {
        String lowercaseColor = $color.toLowerCase();
        String color = "white";
        String[] availableColors = {"black", "red", "blue", "grey"};
        for (String c : availableColors) {
            if (lowercaseColor == c) {
                color = lowercaseColor;
                break;
            }
        }
        return color;
    }

    public void createAppliance(
            String $color,
            char $consumption,
            int $weight
    ) {
        this.color = validateColor($color);
        this.consumption = validateConsumption($consumption);
        this.weight = $weight;
        this.price = 1000;
    }

    protected void finalPrice() {
        switch (this.consumption) {
            case 'A':
                this.price += 1000;
                break;
            case 'B':
                this.price += 800;
                break;
            case 'C':
                this.price += 600;
                break;
            case 'D':
                this.price += 500;
                break;
            case 'E':
                this.price += 300;
                break;
            default:
                this.price += 100;
        }

        this.price +=
                  this.weight < 20 ? 100
                : this.weight < 50 ? 500
                : this.weight < 80 ? 800
                : 1000;

    }

}
