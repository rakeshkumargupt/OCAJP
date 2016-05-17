public class Appendage {
private static String putO(StringBuilder s1) {
s1 = s1.append("O");
return s1.toString();
}
public static void main(String[] args) {
StringBuilder s1 = new StringBuilder("W");
putO(s1);
s1.append("W!");
System.out.println(s1);
}
}