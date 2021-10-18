package Inheritance;

public class Doctor extends civilian {
    Doctor(String name, int age, Double weight) {
    super(name, age, weight);
    //TODO Auto-generated constructor stub
  }

    String heathcenter;
    String graduateYear;
    short degreeLevel;
  
  public static void toOperate(){
    System.out.println("The doctor is operating");
  }


  @Override //using override to recreate class methods for inherited classes
  // ghi đè lên phương thức của tập cha, tập con có thể sử dụng phương thức cùng tên nhưng cách làm thì khác
  // ví dụ cha kêu đi từ A-B, các con có thể đi bằng tàu, máy bay
  public void eat(){
    System.out.println(name + " is eating something else");
  }

}
