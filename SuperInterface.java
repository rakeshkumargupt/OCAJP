interface FF{  }
interface HH extends FF{       }

class SuperInterface implements HH{   
          {   System.out.println(" From SuperInterface classs ");      }
         public static void main(String rsgs[]){
           FF fvar = new SuperInterface();
           HH hvar = new SuperInterface();
           SuperInterface svar = new SuperInterface();     
           
           long lvar = -1L;
           byte bvar = (byte)lvar;
           char cvar = (char)lvar;
           System.out.println(bvar);
           System.out.println(cvar);
           
           long lx = Long.MAX_VALUE;
           System.out.println(lx);
           System.out.println(Float.MAX_VALUE);
           System.out.println(Double.MAX_VALUE);
           
           
             
         }
  }