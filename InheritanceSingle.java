class Employee extends Person {
    Employee(String empName, int age, String designation, double salary) {
        super(empName, age, designation, salary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter Employee Name, Age, Designation & Salary: ");
            String empName = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            String designation = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            employees[i] = new Employee(empName, age, designation, salary);
        }

        for (Employee emp : employees) {
            emp.display();
        }
    }
}
