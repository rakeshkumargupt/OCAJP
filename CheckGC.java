import java.util.Date;
public class CheckGC {
    public static void main(String [] args) {
         Runtime rt = Runtime.getRuntime();
	 System.out.println("Total JVM memory: " + rt.totalMemory()/1000);
         System.out.println("Before Memory = " + rt.freeMemory()/1000);
	 Date d = null;
            for(int i = 0;i<2000000;i++) {
               d = new Date();
              // d = null;
	    }
        System.out.println("After Memory = " + rt.freeMemory()/1000);
        long	 mem = rt.freeMemory()/1000;
	  rt.gc();
        System.out.println("After GC free memory  = "+ ((rt.freeMemory()/1000)-mem));
    }
}
