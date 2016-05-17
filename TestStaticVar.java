class Super1 {  static String ID = "QBANK"; }
class Sub1 extends Super1{
static { System.out.println("In Sub"); }
}
public class TestStaticVar{
public static void main(String[] args){
System.out.println(Sub1.ID);
}
}