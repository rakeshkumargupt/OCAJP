class WidenningWithVarArg{
     public static void main(String args[]){
        byte b = 5;
        go(b,b);
     }
      static void go(int a, int b){
     System.out.println(" From (int, int)");
     }
      void go(byte... c){
     System.out.println(" From (byte...) ");
     }
}
