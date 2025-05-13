import java.util.*;
class Employee{
String fname;
String lname;
float salary,ysalary;
double increment;
Employee()
{
    fname=" ";
    lname=" ";
    salary=0;
    ysalary=0;
}
  public void setter()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the fname: ");
    fname= sc.nextLine();
    System.out.println("Enter the lname: ");
    lname= sc.nextLine();
    System.out.println("Enter the salary: ");
    salary= sc.nextFloat();
}
public void getter()
{
    
    System.out.println("First name is: "+fname);
    
    System.out.println("Last name is: "+lname);
    if(salary<0){
        System.out.println("Salary is :0.0");
    }
    else{
    System.out.println("Monthly Salary is: "+salary);
    }
    ysalary=salary*12;
    {
        System.out.println("Yearly Salary is: "+ysalary);
    }
}
public void rise(){
    increment=salary*0.10;
   double total=salary+increment;
   System.out.println("Salary after incremnet: "+total);
}
}
class EmployeeTest{
    public static void main(String args[]){
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    e1.setter();
    e1.getter();
    e1.rise();
    e2.setter();
    e2.getter();
    e2.rise();
    }

}
    

