public class StringBufferClass 
{ 
   public static void main(String[] args) 
   { 
       StringBuffer strname = new StringBuffer(50);
       System.out.println("String capacity: "+strname.capacity());
       strname = new StringBuffer("Java programming");
       System.out.println("String"+strname);
       System.out.println("Last Index of"+strname.lastIndexOf("ing"));
       System.out.println("Original String is:"+strname);
        strname = strname.delete(2,6);
       System.out.println("Update"+strname);
       StringBuffer strrev = strname.reverse();
       System.out.println("Reverse String:"+strrev);
  } 
} 