class FinalWithStatic{
    static int a;
    static final int b;
  //  {       b = 2 ;   }
    static{    b =3;  }
 //  public FinalWithStatic(){ b = 4; }
 public static void main(String args[]){
  FinalWithStatic fws = new FinalWithStatic();      
      System.out.println(a);
      System.out.println(fws.b);
           char cc = 65;
            System.out.println(cc);
            
 }

}