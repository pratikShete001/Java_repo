import java.util.Scanner;
 class cube{
    static int calCube(int x){
      return x*x*x;
    }
 }
 class static_method {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    cube c1 = new cube();
    c1.calCube(num);
    
    System.out.println(c1.calCube(num));
  }  
}
