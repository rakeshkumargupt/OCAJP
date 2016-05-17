class MethodInheritBase{
 public void a(){ System.out.println("From base class first method");  }
  protected void b(){  System.out.println("From base class Second method"); }
}

class MethodInherit extends MethodInheritBase{
public static void main(String args[]){
  MethodInherit obj = new MethodInherit();
  obj.MethodInherit2();
}
public void MethodInherit2(){
a();
b();
}

}