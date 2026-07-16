public class String_Buffer {
    public static void main(String[] args)
    {
       StringBuffer str= new StringBuffer(50);
       System.out.println("String capacity: "+str.capacity());
       str = new StringBuffer("programing");
       System.out.println("Last index of 'ing' is: "+str.lastIndexOf("ing"));
       StringBuffer strrev = str.reverse();
       System.out.println("Reverse String: "+strrev);
    }
}
