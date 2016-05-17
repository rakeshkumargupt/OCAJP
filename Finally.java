import java.util.*;
class Finally{
 public static void main(String args[]){
      System.out.println("From main trying to execute finally without try and catch");
      try(Scanner obj = new Scanner(System.in)){
      System.out.println(obj.nextLine());     
       	
      	  } 
      finally{
            System.out.println("From finally");
      }
       //     System.out.println(obj.nextLine());      	
 
 }
}