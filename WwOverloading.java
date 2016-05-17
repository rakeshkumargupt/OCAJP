class WwOverloading{
      public static void main(String args[]){
           byte b = 5;
           doSomething(b);
           Integer i = 34;
           int val = i*2;
           System.out.println(val);
           System.out.println(System.currentTimeMillis());
      }
    static void doSomething(Byte l){
     System.out.println(" From Long method");
    }
}
