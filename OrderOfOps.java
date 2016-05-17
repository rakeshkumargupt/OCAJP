public class OrderOfOps{
   static boolean a,b,c;
 
   public static void main(String[] args){
       
      System.out.println( (a=false) && (b=true) || (c=true) ); //line 1
                          // false  // not evaluated so false // true // result = true
 
      System.out.println( (a=false) && (b=true) & (c=true) ); //line 2
                          // false // not evaluated  // not evaluated // result = false
 
   }
}