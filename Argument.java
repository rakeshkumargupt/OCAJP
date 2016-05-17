class Argument{
    {
          index = 1;    
    }	
    int index;
public  static void main(String args[]){
    System.out.println(new Argument().index);

   int arr[]  =  new int[1];
    System.out.println( arr instanceof int[]);
    
    final short  a = 54;
    byte b = a;
    System.out.println(b);
    
    double d = Math.sqrt(-2.0);
    System.out.println(d);
    System.out.println((int)d);
  double d2 = Double.NaN;
  d2 = Float.NaN;
  
  double d3 = 45.56;
  float f3 = 76.76f;
  d3 = 76.76f;
  System.out.println(d3==f3);
      
    












}
}