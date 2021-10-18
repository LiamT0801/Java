package Inheritance;

public class Helloworld {
  public static void main( String args[] ) {
    Pet p = new Pet("Jane", 10);
    //Calling the class version of toString()
      System.out.println(p.getInfo());
    //Calling the original toString()
      System.out.println(p.getAge());
  }
}

class Pet{

  String name;
  Integer age; 

  Pet(String n, Integer a){
    this.name=n;
    this.age=a;
  }
//Over-riding the toString() function as a class function
  public String getInfo(){
    return "The name of the pet is " + this.name + ". The age of the pet is " + this.age;
  }
  public int getAge(){
    return age;
  }
}
