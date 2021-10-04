public class CAT {
  public String name;
  public int age;
  public float weight;

  public void setName(String name){
      this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getName(){
      return name;
  }
  public int getAge(){
      return age;
  }
  public void speak(){
      System.out.println("hi, my name " + name + " " );
  }
  public void move(){
      System.out.println(name + " is on the move");

  }
  public void sleep(){
      System.out.println(name + "Nap taking");

  }
  public void eat(){
      System.out.println(name + "eating");

  }
}
