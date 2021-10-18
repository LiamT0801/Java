package Inheritance;

import studentexp.student;

public class main {
  public static void main(String[] args) {
    civilian Doc01 = new Doctor("liam", 24, 23.3);
    Doctor nurse = new Nurse("Meme", 21, 23.5);
  

    Doc01.eat();
    nurse.eat();


  }
}
