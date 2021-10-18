package studentexp;

import java.lang.reflect.Constructor;

public class student {
  private String name;
  private int age;
  private float mark;
  private boolean marriedStatus;

  public student (String name){
   // this.name dung để phân biệt biến của class, và id của constructor là tham số
    this.name = name;
    this.showMe(); //dùng this gọi methods
  }
  public student(String name, int age){
    this(name); // dùng thế này để gọi tới các constructors khác, phải để đầu tiên!
    this.age = age;
  }
  public student (String name, int age, float mark, boolean marriedStatus){
    this(name, age);
    this.mark = mark; //gọi thuộc tính (class attributes), gán với tham số của của 1 instance mỗi lần đc tạo
    this.marriedStatus = marriedStatus;
  }
  //tạo phương thức (methods)
  public void showMe(){
      TestStudent.showStudentInfo(this); 
      //gọi 1 phương thức từ 1 lớp khác hoặc lớp chính mình
      //Invoke methods from other classes or this class

  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  
}
