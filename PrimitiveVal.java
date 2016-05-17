class PrimitiveVal{
public static void main(String args[]){
          int [] myval = { 1 };
          modifyIt(myval);
          System.out.println(myval[0]);
  }
  
  public static void modifyIt( int [ ] val){
         val[0]++;
      System.out.println( " The modified value is  " + val[0]);
    }

}