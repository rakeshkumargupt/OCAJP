public class Test17 {
 
     public static void main(String args[]) {
          A[] a, a1;
          B[] b;
          a = new A[10];
          a1=a;
          b =new B[20];
          a = b;
           
                 b=(B[]) a;
                  b = (B[]) a1;
      }
      class A { } 
      class B extends A { }
}