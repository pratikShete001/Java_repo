class Item{
    int price;
    String name;
    static String ItemCode = "ISO";
    Item(int price, String name){
        this.price = price;
        this.name = name;
    }
    void display()
    {
        System.out.println(+price+" "+name+" "+ItemCode);
    }
}
class Display_Item{
    public static void main(String args[])
    {
        Item i1 = new Item(11,"Cheese");
        Item i2 = new Item(12,"Vadapav");
        i1.display();
        i2.display();
    }
}