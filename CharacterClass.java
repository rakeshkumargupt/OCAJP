class CharacterClass{
     public static void main(String args[]){
     for(int i=0;i<16;i++)
        System.out.print("  " + Character.forDigit(i,16));

     System.out.println(" \n" + Integer.toHexString(254));
     System.out.println(Long.toOctalString(254));
     System.out.println(Boolean.getBoolean("true"));


     }
}
