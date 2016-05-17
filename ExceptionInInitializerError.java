class ExceptionInInitializerError{
 static{
 	  String i=null;
        System.out.println(" From Static Block" + i.length()); 
 }
 public static void main(String args[]){
       System.out.println(" From main method ");
  
 }

}