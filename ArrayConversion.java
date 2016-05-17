import java.math.*;
class Array{ 
        public String toString(){
        	  return " From Parent Class ";
        }
}
class ArrayConversion extends Array{
	              public String toString(){
        	  return " From Parent Class ";
        }
	 
        public static void main(String args[]){
                Array[ ] ar = new Array[4];
                ArrayConversion[ ] ac = new ArrayConversion[4];
                   ar =  ac;
                  for( Array var : ar)
                         System.out.println(var);
                  Object obj = 343;
                  System.out.println(obj);
                  
                  double d = Math.sqrt(-1.0);
                  int x  = (int)d;
                  System.out.println(x);
                           
        }
} 