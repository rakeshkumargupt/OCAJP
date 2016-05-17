import java.io.*;
class Base{
 public float aMethod(float a) throws IOException{
     return 3f;
  }
}

class LegalOverriding extends Base{
  public static void main(String args[]) throws IOException{
  	Base lo = new LegalOverriding();
   System.out.println(lo.aMethod(87f));
  }
  public float aMethod(float b){
      return 4f; 
  }

}
