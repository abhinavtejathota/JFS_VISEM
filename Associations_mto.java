class Department {
    int deptId;
    String deptName;
    Department(int deptId, String deptName) 
	{
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

class Employee {   
    int empId;
    String empName;
    Department dept;   
    Employee(int empId, String empName, Department dept) 
	{   this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }
}

class Main {
    public static void main(String[] args) 
	{
        Department d1 = new Department(101, "CSE");
        Employee e1 = new Employee(1, "Ravi", d1);
        Department d2 = new Department(102, "IT");
        Employee e2 = new Employee(2, "Anita", d2);
        Department d3 = new Department(103, "ECE");
        Employee e3 = new Employee(3, "Krishna", d3);
        System.out.println(e1.empName + " works in " + e1.dept.deptName);
		System.out.println(e2.empName + " works in " + e2.dept.deptName);		
		System.out.println(e3.empName + " works in " + e3.dept.deptName);
        
    }
}
