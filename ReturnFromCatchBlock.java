import java.io.*;
public class ReturnFromCatchBlock {
public static void main(String args[]) {
openFile();
}
private static void openFile() {
FileInputStream fis = null;
try {
fis = new FileInputStream("file.txt");
}
catch (FileNotFoundException fnfe) {
System.out.println("file not found");

}
finally {
System.out.println("finally");
}

System.out.println("Next task..");
}
}