import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Custom class Iterator

 class Employee
{
    private int EmpId;
    private String EmpName;
    private String Designation;
    private double salary;

    public Employee(int EmpId,String EmpName,String Designation, double salary)
    {
        this.EmpId =EmpId;
        this.EmpName=EmpName;
        this.Designation=Designation;
        this.salary=salary;

    }
    public int getEmpId()
     {
         return EmpId;
     }
     public String getEmpName()
     {
         return EmpName;
     }
     public String getDesignation()
     {
         return Designation;
     }
     public double getSalary()
     {
         return salary;
     }

     @Override
     public String toString()
     {
         return EmpId+" "+EmpName+" "+Designation+" "+salary;
     }

}

class Employees implements Iterable<Employee>
{
    private List<Employee> emps=null;
    public Employees(){
        emps=new ArrayList<>();
        emps.add(new Employee(1001,"Rams","Lead", 250000L));
		emps.add(new Employee(1002,"Posa","Dev", 150000L));
		emps.add(new Employee(1003,"Chinni","QA", 150000L));
    }

    @Override
    public Iterator<Employee> iterator()
    {
        return emps.iterator();
    }
}

public class EmployeesTester{
    public static void main(String[] args)
    {
        Employees emps=new Employees();
        for(Employee emp:emps)
        {
            System.out.println(emp);
        }
    }
}
