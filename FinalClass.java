class FinalClass{
     int x = 5;
     public static void main(String args[]){
       final FinalClass f1 = new FinalClass();
       FinalClass f2 = new FinalClass();
       FinalClass f3 = FinalClassSwitch(f1, f2);
       System.out.println((f1==f3) + "  " + (f1.x==f3.x));
     }

     static FinalClass FinalClassSwitch( FinalClass x, FinalClass y){
      final FinalClass z = x;
      z.x = 6;
      return z;
     }
}
