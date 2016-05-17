class InstanceStatement{
     static String name = " first static statement";
     String add = " First instance statement";
     
     static{
           System.out.println(" From first static block" + name) ;     
     }
     {
           System.out.println(" First instance block" + add);    
     }
     public static void main(String args[]){
      new InstanceStatement();    
      
     }

}