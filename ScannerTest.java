import java.util.*;
class ScannerTest{
     public static void main(String args[]){
       // String scanMe = "123x45x67";
       String delim = "x";
       Scanner sc = new Scanner( new Scanner(System.in).nextLine() );
       sc.useDelimiter(delim);
       while(sc.hasNext()){
        System.out.println(sc.next());
       }
     }
}
