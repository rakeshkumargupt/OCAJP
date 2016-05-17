class ObjectEqual{
public static void main(String args[]){
  Object obj = new Long(8);
  Long l = new Long(8);
  System.out.println(obj.equals(l));
  long l2 = 454;
  System.out.println(l2);
  
  int v = 'a';
  System.out.println(v);
  
  final int b =  5;
  // int c = b++;
//  System.out.println(c);

  int d = 'a' * 'a';
System.out.println(d);

float f1 = 0.0f;
float f2 = -1.0f;
System.out.println(Float.isInfinite(f2/f1));

double d1 = -5;
double d2 = 0;
double result = d1%d2;
System.out.println(result);











}

}