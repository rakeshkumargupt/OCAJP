class ClassLoadingBase{
  static int var  = 4;
  static{   System.out.println("From base class static block");}
  public void call(int aa){  System.out.println("From base class Non-static method");}
  
}
class ClassLoading{
  public static void main (String args[]){
     System.out.println("Main method loaded");
     ClassLoadingBase clb = null;
     System.out.println("Null reference var created");
     System.out.println(clb.var);
  //   System.out.println(clb.call(9));  
  }
}