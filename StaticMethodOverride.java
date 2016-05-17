class StaticOverride{
static void foo(){   System.out.println(" From Parent Class "); }
}
class StaticMethodOverride extends StaticOverride{
static void foo()  { System.out.println(" From Child Class "); }
public static void main(String args[]){
foo();
StaticOverride.foo();
}
}
