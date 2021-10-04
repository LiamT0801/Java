package classobjects;

public class classObject {
  public static void main(String[] args) {
   
    CAT cat = new CAT( "TOM", 3, 10); // đây là phương thức khởi tạo (constructors), chứa tham số, cùng tên với class, 
    // mỗi lần khởi tạo 1 class thì constructors sẽ tạo thuộc tính (initialize object' attributes) right away
    
    System.out.println(cat.getName()); //to get attributes of an object, use print
    
    
    System.out.println(cat.getAge());
    
    
    
    cat.getWeight(); //to call a method of an object object.method
    cat.speak();

    Mobile iphone = new Mobile("Apple", "13", "Qualcom");
    System.out.println(iphone.getBrand());
    
  }
}
