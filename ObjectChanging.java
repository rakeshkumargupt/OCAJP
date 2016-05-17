class Boo{   
          Boo(String s){ System.out.println(" From Boo with parameterize constructor");  }
          Boo( ){    System.out.println(" From Boo without parameterize constructor");        }
}
class ObjectChanging extends Boo{
	        ObjectChanging(){        }
	        ObjectChanging(String ss){     }
          public static void main(String args[]){
                       Boo b = new Boo(){    };
                       Boo bb = new Boo(){ String s;  };
                        Boo bc = new Boo("Calling"){    };             
          
          }
}