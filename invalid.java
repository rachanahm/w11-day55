class InvalidLengthException extends Exception {
  InvalidLengthException(String str){
    super(str);
  }
}
class Demo{
  public static void main(String args[]){
    String str="Racha";
    try{
      if(str.length()==5){
        throw new InvalidLengthException("length not equals to 5");
      }
    }catch(InvalidLengthException e){
      System.out.println("error"+e.getMessage());
    }
  }
}