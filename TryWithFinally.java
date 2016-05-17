class TryWithFinally{
      public static void main(String args[]){
           System.out.println(stringConvert("0.2"));
          System.out.println(stringConvert("0.2AB")); 
           System.out.println(stringConvert(null)); 
      }
      
      public static boolean stringConvert (String s){
                  float f = 0;
                  try{
                        f = Float.valueOf(s).floatValue();
                        return true;                  
                  }
                  catch(NumberFormatException nfe){
                        System.out.println(" Bad number " + s);
                        f = Float.NaN;                  
                  }      
                  finally{
                           System.out.println("From Finally");                  
                  }
                
                return false;  
      
      }  
  
}