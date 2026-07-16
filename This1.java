class Dept{
    int dept_id;
    String dept_name;
    Dept(int dept_id,String dept_name)
    {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }
    void show(){
        System.out.println("\nDempartment name= "+dept_name+" \nDepartment id = "+dept_id);
    }
}

class This1{

    public static void main(String args[])
    {
        Dept dept1 = new Dept(1,"Computer science");
        dept1.show();
    }
}