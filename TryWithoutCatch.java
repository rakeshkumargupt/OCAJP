class TryWithoutCatch{
     public static void main(String args[]){
             try{
              throw new Exception();             
             }     
             finally{
                System.out.println(" From finally block!!");             
             }
     
     }

}