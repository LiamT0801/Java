package Inheritance;

public class civilian {
  //inheritance (kế thừa): tạo class mới = class cũ, "extends",
  //chỉ cho phép đơn kế thừa (1 con 1 cha)
  public String name;
  public int age;
  public double weight;

  civilian(){
  }
  civilian(String name, int age, Double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public String getName(String name){
    return name;
  }
  public int getAge(int age){
    return age;
  }
  public float getWeight(float weight){
    return weight;
  }

  public void eat(){
      System.out.println(name + " is eating");
  }
  public void move(){
      System.out.println(name + " is moving");
  }
  public void sleep(){
      System.out.println(name + " is sleeping");
  }
}
