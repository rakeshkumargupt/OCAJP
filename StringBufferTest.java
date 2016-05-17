class StringBufferTest{
    public static void main(String afa[]){
            StringBuffer sb = new StringBuffer();
            sb.append(1);
            sb.append(" is odd number");
            System.out.println(sb);
            sb.insert(0,"Hello!");
            System.out.println(sb);
            sb.insert(3,"<Between>");
            System.out.println(sb);
            sb.setCharAt(5, 'A');
            System.out.println(sb);
            sb.append("true");
            System.out.println(sb);
            System.out.println(sb.capacity());
            System.out.println(sb.length());
            Child c = new Child();
            sb.append(c);
            System.out.println(sb);

    }
}
class Child{
    @Override
    public String toString(){
   return "From Child Class";
}

}


