package classobjects;
public class CAT {
  public String name;
  public int age;
  public float weight;

  CAT(String catName, int catAge, float catWeight){
        name = catName;
        age = catAge;
        weight = catWeight;
  } // tạo 1 constructor, giúp ng dùng không phải suốt ngày get and set
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){ // void means no return needed
    this.age = age;
  }
  public String getName(){
      return name;
  }
  public int getAge(){
      return age;
  }
  public float getWeight(){
    return weight;
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
