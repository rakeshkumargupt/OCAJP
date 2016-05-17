class StringBuilderDemo{
  public static void main(String args[]){
     StringBuilder sb =   new StringBuilder("abcde");
      // sb.append("ABC");
       sb.insert(sb.length(),"ABC");
     System.out.println(sb);
  }
}