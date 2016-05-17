import java.math.*;
class ShortCircuit{
    public static void main(String args[]){
      int val = (int)(2*Math.random());
      boolean test = (val==0) | (++val==2);
      System.out.println("  test = " + test + "  val = " + val);
    }
}