package Inheritance;

public class Nurse extends Doctor {

  Nurse(String name, int age, Double weight) {
    super(name, age, weight);
    //TODO Auto-generated constructor stub
  }
  public void eat(){
    System.out.println(name + " is eating an apple");
  }
}
