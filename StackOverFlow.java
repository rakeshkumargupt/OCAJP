class StackOverFlow{
     public static void main(String args[]){
         try{  myMethod(); }
         catch(StackOverflowError e){
                  for (int i=0; i<2; ++i)
                       System.out.println(i);        
         }  
         System.out.println(" Next line after the error handled");        
     }
     public static void myMethod(){
      //    System.out.println("From Recursive method calling");
          myMethod();     
     
     }

}