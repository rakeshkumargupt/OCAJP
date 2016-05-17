
interface Demo1{   }
interface Demo2 extends Demo1 {      }
class DemoInterface implements Demo2{
public static void main(String args[]){
     Demo1 obj =  new DemoInterface();
     
     long l = -1L;
     byte b = (byte)l;
     System.out.println(b);

}
}