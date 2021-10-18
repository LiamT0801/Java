package Inheritance;

import java.util.ArrayList;

abstract class Bike{
  abstract void run();
  abstract void stop();
}
//dùng abstract như 1 methods blue print chỉ đặc tính tập con có thể có chức năng giống như cha nhưng theo 1 cách khác
// tập con bắt buộc phải khai báo tất cả chức năng đc thừa hưởng
//subclass must call all methods inherited from class
// collection of common properties -> abstract class
class honda extends Bike{

  @Override
  void run() {
    System.out.println("running safely");
  }
  @Override
  void stop() {
      System.out.println();    
  } 

    public static void main(String[] args) {
    Bike obj = new honda(); // cannot instantiated from abstract class if you replace honday with bike
    ArrayList<civilian> civilians = new ArrayList<>();
    civilians.add(new civilian());
    civilians.add(new civilian());
    civilians.add(new civilian());

    //civilian a = civilians.get(0); 
    System.out.println((civilians.size()));
}

  
}
