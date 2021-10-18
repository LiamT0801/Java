package musicplayerapp;

public class Song {
  String title;
  double duration;

  public Song(String title, double duration){
    this.title = title;
    this.duration = duration;
  }
  public String getTitle(){
    return title;
  }
  public double getDuration(){
    return duration;
  }
  public String toString(){
    return "Song: " + title + "\n Duration: " + duration; 
  }
  
}
