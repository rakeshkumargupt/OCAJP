 class StaticMethod{  
          static void doStuff(){
                 System.out.println(" A ");          
          }
}
class StaticMethodRedefine extends StaticMethod{
	      public static void main(String args[]){
               StaticMethod[] a = {  new StaticMethod(),
                                                   new StaticMethodRedefine(),
                                                   new StaticMethod()                                      
                                                };	
                for(int x = 0; x < a.length; x++){
                     a[x].doStuff();                
                }      
           ((StaticMethodRedefine)(a[1])).doStuff();
	      }
           static void doStuff(){
                 System.out.println(" D ");          
          }

}