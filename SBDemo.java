class SBDemo{
   public static void main(String args[]){
          StringBuilder sb = new StringBuilder();
          sb.append(4);
    //   System.out.println(sb.length());
    // System.out.println(sb.capacity());
    //       sb.trimToSize();   
    //     System.out.println(sb.capacity());
       //  String s = null;
         StringBuilder sb2 = new StringBuilder();
         System.out.println(sb2);
        System.out.println(sb2.capacity());
        sb = null;
        sb2.append(sb);
        System.out.println(sb2);
   
   }

}