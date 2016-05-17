class Animal{  }
class Horse extends Animal{  }

class OverloadCalling{
      public static void main(String args[]){
       OverloadCalling oc = new OverloadCalling();
       Animal an = new Animal();
       Horse hr = new Horse();
       oc.doStuff(an);
       oc.doStuff(hr);
      }
      public void doStuff(Animal a){
            System.out.println(" In Animal version");      
      }
    
     public void doStuff(Horse h){
            System.out.println(" In Horse version");      
      }
    
}