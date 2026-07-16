class TestConst
{
    int playernumber;
    String playname;
    public TestConst()
    {
        playernumber = 10;
        playname = "Sachin Tendulkar";
    }
    public static void main(String[] args)
    {
        TestConst tc = new TestConst();
        System.out.println("Default Value");
        System.out.println("Play number = "+tc.playernumber);
        System.out.println("Play Name = "+tc.playname);
    }
}