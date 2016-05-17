import java.io.*;
class ThrowingException{
       public static void main(String args[]) throws IOException{
            System.out.println(" From main"); 
            m();       
       }
       public static void m() throws IOException{
                IOException x = new IOException(" Your messages!!");
                throw x;       
       }
}