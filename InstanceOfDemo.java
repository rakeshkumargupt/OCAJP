interface FF{ }
class DD implements FF{       }
class EE extends DD {  }

class InstanceOfDemo{
  public static void main(String args[]){
  	       DD d = new DD();
  	       EE e = new EE();
  	       DD d2 = new EE();
  	       FF f = new DD();
         System.out.println( (d2 instanceof EE) + "  Wrong");  
         System.out.println( d2 instanceof DD);
         System.out.println( d2 instanceof Object);
         System.out.println( d2 instanceof FF);   
         System.out.println( f instanceof EE);  
         System.out.println( f instanceof DD);  
         System.out.println( f instanceof FF);  
       System.out.println( new EE() 	instanceof Object);     
       
//       System.out.println( "ABC" instanceof java.lang.Class);          
  }
}