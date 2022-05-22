package Entities;

public abstract class Animal {
  private String name;
  private String food;
  private int age;
  private String raze;

  protected Animal(
      String name,
      String food,
      int age,
      String raze) {
    this.name = name;
    this.food = food;
    this.age = age;
    this.raze = raze;
  }

  public String feed() {
    return "Eating " + food;
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public int getAge() {
    return age;
  }

  public String getRaze() {
    return raze;
  }

}
