 class SuperClass{ 
        SuperClass(){
               System.out.println (" From superclass constructor ");        
        }
           SuperClass(int val){
               System.out.println (" From superclass constructor " + val);        
        }
}

class ConstructorTest2 extends SuperClass{
            static { System.out.println("Hi!! From static child block");}           
           int b = 4;           
           ConstructorTest2(){
                System.out.println(b);
                //this(5);
                 	        
	        }
	        ConstructorTest2(int a){
	        	super(88);
              System.out.println(" From child constructor with values " + a);	        
	        }
	
         public static void main(String args[]){
            new ConstructorTest2(7);
         }

}