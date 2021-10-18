package Thread;

class WorkerThread implements Runnable {
  private String message;

  public WorkerThread (String s){
    this.message = s;  //constructor
  }
  public void run(){
    System.out.println(Thread.currentThread().getName()+"(Start) message = " + message );
    processmessage(); // call this message to sleeps thread for 2 secs
    System.out.println(Thread.currentThread().getName()+ "(End)"); //prints thread name
  }
  public void processmessage(){
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }
}