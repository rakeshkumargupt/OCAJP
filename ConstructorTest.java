import java.io.*;
class ConstructorTest{
       ConstructorTest() throws IOException{     }
       ConstructorTest(ConstructorTest m) throws IOException{
           m1 = m;
       }
       ConstructorTest m1;
      public static void main(String args[]) throws Exception{
          ConstructorTest m2 = new ConstructorTest();
          ConstructorTest m3 = new ConstructorTest(m2);
          m3.go();
          ConstructorTest m4 = m3.m1;
          m4.go();
          ConstructorTest m5 = m2.m1;
          m5.go();
      }
      void go(){
       System.out.println(" Hii!");
      }
}
