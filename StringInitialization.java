class StringInitialization{
private String title;
public String getTitle(){
         return title;
}
public static void main(String args[]){
           StringInitialization st = new StringInitialization();
           System.out.println(st.getTitle());
           java.util.Date dt = new java.util.Date();
           java.lang.String st2 = new String();
           System.out.println(" >" + st2 + "< ");
          System.out.println(dt);
          System.out.println(st2.length());
     

           
}

}