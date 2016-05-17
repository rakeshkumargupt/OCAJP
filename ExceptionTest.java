import java.io.*;
class ParentException{
  void go() throws Exception{ System.out.println("From parent class"); }
}

class ExceptionTest extends ParentException{
 void go() throws RuntimeException{  System.out.println("From child class"); }
public static void main(String args[]) throws Exception{
System.out.println("Hello!!");
ParentException pe = new ExceptionTest();
pe.go();
}
}
