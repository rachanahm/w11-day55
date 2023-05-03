class Demoexcep{
  public static void main(String args[]){
    System.out.println("Rachana");
   int a=10,b=0;
    try{
     System.out.println(a/b);
  }
  catch(ArithmeticException e){
    System.out.println(e);
  } 
  }
}