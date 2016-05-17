class Alpha
{
    static String s = "  ";
    protected Alpha()
    {
        s += "Alpha ";
    }
}
class SubAlpha extends Alpha
{
    private SubAlpha()
    {
        s += " Sub ";
    }
}
class PrivateConstructor extends Alpha
{
    private PrivateConstructor()
    {
        s += " SubSub";
    }
    public static void main(String args[])
    {
        new PrivateConstructor();
        System.out.println(s);
    }
}
