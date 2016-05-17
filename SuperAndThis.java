class SuperThis{
   String name = "Parent";
   int id = 123;

}
class SuperAndThis extends SuperThis{
	String  name = "Child";
	int id = 124;
	SuperAndThis(){
          System.out.println(super.name);
       System.out.println(super.id);
       
       System.out.println(this.name);
       System.out.println(this.id);

	}
 public static void main(String args[]){
   new SuperAndThis();
 }

}