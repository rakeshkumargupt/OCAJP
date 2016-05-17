class VarInClass{
      public static void main(String args[]){
       System.out.println(" From main ");
         VarInClass vc = new VarInClass();
         vc.printValue();
      }
      
      void printValue(){
       System.out.println(" The value of Instaance Var is " + i);
      }
      int i = 9;
      
}