class StringWithSwitch{
  public static void main(String args[]){
      String s = "AS";
      switch(s){
                      case "A" : System.out.println("From A"); break;
                      case "B" : System.out.println("From B");
                    //  case null : System.out.println("From A");
                      default : System.out.println("Default");   
                      StringBuilder sb = new StringBuilder("RAKESH");
                      System.out.println(sb.subSequence(2,4));   
       }
       
                      StringBuilder sb2 = new StringBuilder("RAKESH");
                      System.out.println(sb2.delete(2,3));
  
  }
}