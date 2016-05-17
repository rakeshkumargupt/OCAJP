class Base{
   private final void flipper(){
        System.out.println( " Base Class ");
   }
}
class PrivateMethod extends Base{
    public final void flipper(){
      System.out.println(" PrivateMethod ");
    }
   public static void main(String args[]){
   	Base b = new PrivateMethod();	
      b.flipper();
   }
}
