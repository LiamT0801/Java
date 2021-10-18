package classobjects;

public class test {
  private int data = 30;
  
  class Inner{
    void msg(){
      System.out.println("data is" + data);
    }
  }
  
  public static void main(String[] args) {
    test a = new test();
    test.Inner b = a.new Inner();
    b.msg(); 
  }
}

