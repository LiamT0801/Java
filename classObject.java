

public class classObject {
  public static void main(String[] args) {
   
    CAT cat = new CAT("TOM", 3, 10); // đây là phương thức khởi tạo (constructors), chứa tham số, cùng tên với class, 
    // mỗi lần khởi tạo 1 class thì constructors sẽ tạo thuộc tính (initialize object' attributes) right away
    
    System.out.println(cat.getName());
    
    
    System.out.println(cat.getAge());
    
    
    System.out.println(cat.getWeight());
  }
}
