package studentexp;

public class overloading {
  
  public static void main(String[] args) {
    //overloading dùng khi khởi tạo nhiều phương thức giống nhau (tên) và các phương thức này dùng trong nhiều cách 
    // a same method with different parameters
    float sumF = add(2.2f,4.5f);
    System.out.println(sumF);
    

    doubleSquare(3.5);
  }

  public static int add(int a, int b){ 
    return a + b;
    //static keyword belongs to the class than an instance of the class.
  }
  public static double add(int a, short b, double c){
    return a + b + c;
  }
  public static float add(float a, float b){
    return a+b;
  }
  public static void doubleSquare(double number)
  {
    double square = number * number; 
    System.out.println("Method with double Argument Called: "+square);
  }
  public static void longSquare(long number)
  { 
    long square = number * number;
    System.out.println("Method with long Argument Called: "+square);
  }

}
