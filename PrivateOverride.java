class PrivateOverrideBase{
private void f(){  System.out.println("From private Base");   }
public void g(){ f(); }
}
class PrivateOverride extends PrivateOverrideBase {
public static void main(String args[]){
 PrivateOverrideBase obj = new PrivateOverride();
 obj.g();

}
public void f(){   System.out.println(" From child class ");   }

}