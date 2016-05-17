class StaticVar{
static int a = 9;
 final public static void main(String args[]){
  int a = (a=5);
  System.out.println(a);
  System.out.println(StaticVar.a);


}

}