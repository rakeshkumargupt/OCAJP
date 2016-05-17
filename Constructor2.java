import java.util.*;
class Constructor2Base{
   int a;
   public Constructor2Base(int b) throws Exception{   a = b; }
}

class Constructor2{
public static void main(String args[]) throws Exception{
  Constructor2Base c2b = new Constructor2Base(45); 
   System.out.println(c2b.a);
}

}