class LegalOverloading{
    public static void main(String args[]){
     System.out.println(invalid((short)6,(short)8));
    }
    static String invalid(Short s1){  return " From short argument";}
    static String invalid(short... s2){  return " From short... argument";}
    static String invalid(int a){ return " From int method";}
}
