/**/class Variable{
     int a;
     String b;
     Variable(String str){
        b = str;     
     }
}

class InstanceVar extends Variable{
	InstanceVar(){
		super("Child Class");
	}
 	public static void main(String args[]){
           Variable v = new Variable("From main");
         InstanceVar iv = new InstanceVar();
            System.out.println(iv.a);
            System.out.println(iv.b);
            
            System.out.println(v.a);
            System.out.println(v.b);
            	
	}
}