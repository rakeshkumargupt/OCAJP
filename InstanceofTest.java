class A { }
 class InstanceofTest extends A{
      public static void main(String args[]){
         A myA = new InstanceofTest();
         m2(myA);
      }
      public static void m2(A a){
           if( a instanceof A){
             ((InstanceofTest)a).doStuff();           
           }
        }      
        public static void doStuff(){
         System.out.println(" 'a' refers to InstanceofTest ");      
         System.out.println("Hello!");
      
         
           
        }
      
}
