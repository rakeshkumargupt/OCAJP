class Exception1 extends Object{
    String x = "";
    Exception1(int a, int b) throws Exception {
          System.out.println(" In overloaded constructor");
          throw new Exception("");
    }
    public static void main(String args[]) throws Exception{
      System.out.println(" From main method");
      new Exception1(4,2);
    }
}
