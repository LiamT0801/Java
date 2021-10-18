package readjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readinput {
  public static void main(String[] args) throws FileNotFoundException {
    String folder = "readjava/";
    File file = new File (folder + "input.txt");
    Scanner sc = new Scanner(file);
    String [] words = new String[100];
    int i = 0;


    while(sc.hasNext()){
      String w = sc.next();
      words[i] = w;
      i++;
    }
    showInfo(words);
    
  }
  private static void showInfo(String[] words) {
    for (String word : words){
      if (word == null){
        break;
      }
      System.out.println(word);
    }   
  }
    
}
