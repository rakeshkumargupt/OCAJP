class OverrideByReturnBase{
         String getMessage(){
                return " Return from Base class";         
         }
}

class OverrideByReturn extends OverrideByReturnBase{
	 String getMessage(){
                return  super.getMessage()+" But invoked from Child Class";         
         }
       public static void main(String args[]){
       	OverrideByReturn obr = new OverrideByReturn();
       	System.out.println(obr.getMessage());
       }
}