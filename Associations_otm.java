import java.util.*;
class Employee {
    int id;
    String name;
    float salary;
    Employee (int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Department {
    int deptId;
    String deptName;
    List<Employee> emplst;
    Department (int deptId, String deptName, List<Employee> emplst){
        this.deptId = deptId;
        this.deptName = deptName;
        this.emplst = emplst;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ravi", 10000);
        Employee e2 = new Employee(2, "Anita", 15000);
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        Department dept = new Department(101, "CSE", empList);
        System.out.println("Department:"+dept.deptName);
        float total = 0;
        float max = 0;
        String who = "";
        for(Employee e : dept.emplst) {
            System.out.println(e.id+" "+e.name+" "+e.salary);
            total += e.salary;
            if(max < e.salary) {
                max = e.salary; 
                who = e.name;
            }
        }
        System.out.println("avg salary: "+ total/dept.emplst.size());
        System.out.println("Highest salary: "+max+" - Person: "+who);
    }
}
