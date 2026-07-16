import java.util.Scanner;
class Employee {

 int id;
 String name;
 float salary;
 public void emp_getdata()
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the Emmployee id: ");
  id = in.nextInt();
  System.out.println("Enter the employee Name: ");
  name = in.next();
  System.out.println("Enther the Employee salary");
  salary = in.nextFloat();
 }
 public void emp_putdata()
 {
  System.out.print(" "+id);
  System.out.print("\t"+name);
  System.out.print("\t"+salary);
  System.out.println();
 }
}


class Demo{
  public static void main(String args[] ){
    Scanner sc = new Scanner(System.in);
    Employee emp_obj[] = new Employee[50];
    System.out.println("How many record you want enter of Employee ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      emp_obj[i] = new Employee();
      emp_obj[i].emp_getdata();
    }
    System.out.println("**** Employee Information ****");
    System.out.println("Emp id \t Emp Name \t Emp Salary \n");
    for (int i = 0; i < n; i++) {
      emp_obj[i].emp_putdata();
    }
  }
}