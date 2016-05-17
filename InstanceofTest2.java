interface Foo{  }
class FooClass implements Foo{   }
class InstanceofTest2 extends FooClass{
       public static void main(String args[]){
                 FooClass a = new FooClass();
                 InstanceofTest2 b  = new InstanceofTest2();
                 System.out.println(a instanceof Foo);
                 System.out.println(b instanceof FooClass);
                 System.out.println(b instanceof Foo);
                 System.out.println(a instanceof FooClass);       
       }
}