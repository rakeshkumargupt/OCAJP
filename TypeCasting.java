class Base1 {
public void print() {
System.out.println("Base");
}
}
 
class TypeCasting1 extends Base1 {
public void print() {
System.out.println("Derived");
}
}
 
class TypeCasting {
public static void main(String args[]) {
Base1 obj1 = new TypeCasting1();
Base1 obj2 = (Base1)obj1;
 ((Base1)obj1).print();
obj1.print();
obj2.print();
}
}
 