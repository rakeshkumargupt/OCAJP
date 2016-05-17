abstract class AbstractD{
        public void printData(){
           System.out.println(" From AbstractClass method");        
        }	
	  }
class AbstractDemo{
	public static void main(String args[]){
         new AbstractD().printData();	
	}
}