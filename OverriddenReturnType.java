class OverrideNumber{
Number getValue(){
         return new Long(34);
 }
}
class OverriddenReturnType extends OverrideNumber{
         Float getValue(){
           return new Float(34.34f);
         }
        public static void main(String args[]){
        	OverrideNumber ort = new OverriddenReturnType();
          System.out.println(ort.getValue());
        }

}
