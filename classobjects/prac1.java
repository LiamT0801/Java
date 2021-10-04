package classobjects;
import java.util.Scanner;




class leanrcode{
  public static void main(String[] args) {
    // int a = 133;
    // String even = "this is an even number";
    // String odd = "this is an odd number";
    // String result ="";
  
    // result = (a%2==0)? even:odd;
    // System.out.println(result);

    // //switch case
    // Scanner sc = new Scanner(System.in);


    // String day;
    // System.out.println("Enter day: ");
    // day = sc.nextLine();
    
    // switch(day){
    //   case "Monday":
    //     System.out.println("Monday, work bitch");
    //     break;
    //   case "Tuesday":
    //     System.out.println("Tuesday");
    //     break;
    //   case "Wednesday":
    //     System.out.println("Wed");
    //     break;
    //   default:
    //     System.out.println("Invalid day");
    //   sc.close();
    // }

    //For loop
    // float sum = 0;
    // int n = 100;
    // for(int a=1; a<n; a++){
    //   sum+=(float)1/a;
    // }
    // System.out.println(sum);

    //while loop
    // float sum =0;
    // int n = 100;
    // int a = 1;
    // while (a<n){
    //   sum += (float)1/a;
    //   a++;
    // }
    // System.out.println(sum);

    // loop character
    // String name = "HelloWord!";
    // int i = 0;
    // while (i<name.length()){
    //   System.out.println(name.charAt(i));
    //   i++;
    // }
    // for(int i=0; i<name.length();i++){
    //   System.out.println(name.charAt(i));
    // }



    // Do-while loop
    // int i = 0;
    // int n = 3; 
    // do{
    //   System.out.println("Hola");
    //   System.out.println("i = " + i);
    //   i++;
    // }
    // while(i<n);
    
    // //Infinite Loop
    // for(;true;){
    //   System.out.println("Liam");}


    // nested loop
    // for (int i = 0; i < 5 ; i++){
    //   for (int j = 0; j < 5; j++){
    //     System.out.print(j+" ");
    // }
    //   System.out.println();
    // }


    //break, continue
    // String greet = "Hello There!";
    // for (int i=0; i<greet.length(); i++){
    //   if(greet.charAt(i)=='T'){
    //     break;
    //   }
    //   System.out.print(greet.charAt(i));
      

    // for (int i = 0; i<10; i++){
    //   if (i%2!=0){
    //     continue;  
    //   }
    //   System.out.print(i+ " ");
    // }

    //Array

    // String [] names = {"Ngoc", "Lam", "Huong", "Binh"};

    // for (int i = 0; i< names.length; i++){
    //   System.out.println("Name at index" + "[" + i + "]:" + names[i]);
    // }
    // // change index in array
    // names[0] = "Mentori";
    // System.out.println(names[0]);

    // declear an array (mảng)
    // int [] a = new int[200]; // default value = 0 for int, boolean or string (null),..
    // boolean [] b = new boolean[10];
    // System.out.println(a[20]);
    // System.out.print(b[1]);
      
    //2D array (mang 2 chieu)
    // boolean [][] bools;
    // int [][] matrix ={
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9}
    // };
    // bools = new boolean [5][9]; // rows n cols

    //2D vs nested or loop
    // for (int i=0; i < matrix.length; i++){
    //   for (int j = 0; j < matrix[0].length; j++){ //matrix elements {1, 2, 3}
    //     System.out.print(matrix[i][j]+ " ");
    //   }
    //   System.out.println("");
    // }
    // System.out.println(matrix[0][2]);



    //for each can be replaced with for loop
    // String [] className = {"Linh", "Lang", "Lam", "Ly", "Andree", "John"};

    // for (String name : className){
    //   if (name == "Ly"){
    //     break; 
    //   }
    //   System.out.println(name);
    // }
      
    // int [][] matrix = {
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9}
    // };
    // System.out.println("========");
    // for (int [] m : matrix){
    //   for (int i : m){
    //     System.out.print(i+" ");
    //   }
    //   System.out.println("");


    // hàm (function), đúng thứ tự,
    // cú pháp access_modifier(public/private) type name (params){body}

  //     int a = 56, b = 120;

  //     int sum = add(a,b);
  //     System.out.println("sum = " +sum);

  //     int [] nums ={1,2,3,4,5};
  //     float avg = average(nums);
  //     System.out.println("the avg = "+avg);

  //     numEvaluation(120, 30, 190);
  // } 
  // public static int add(int a, int b){  //return int as a must
  //   int sum = a + b; 
  //   return sum;
  // }
  // public static float average (int [] arr){
  //   int sum = 0;
  //   for (int i : arr){
  //     sum += i;
  //   }
  //   return (float) sum/ arr.length;
  // }
  // public static void numEvaluation(int a, int b, int c){ //void: phương thức k nhận tham số, k trả về 
  //   int max = a;
  //   if (max < b){
  //     max = b;
  //   }
  //   if (max < c){
  //     max = c;
  //   }
  //   System.out.println("max = "+ max);


  // tham số đối số
  // addMulti(21.5f,34,12); //f for float otherwise it will save as double
  // float [] arr ={23,24.5f,24};
  // addMulti(arr);
  // }
  // public static void addMulti(float ...args){ // ...args: passed args not limited
  //   float sum = 0;
  //   for (float arg : args){
  //     sum+=arg;
  //   }
  //   System.out.println("Sum = "+ sum);


  // Lấy dữ liệu từ bp
  // String a;
  // float b;
  // Scanner sc = new Scanner(System.in);
  // System.out.println("please, enter your name");
  // a = sc.nextLine();
  // System.out.println("Hello, "+ a);

  //tính đóng gói dữ liệu (private/public)
  }
}




