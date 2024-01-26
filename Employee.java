//Problem 1.4

package taskstwo
public class Employee extends PersonBase{
    int employeeID,salary;
    public Employee(String name, int age, int employeeID, intsalary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Vimal", 25, 3, 47000);
        System.out.println("Employee ID : " + employee.employeeID + " Name : " + employee.getName() + " Age : " + employee.getAge() + " Salary : " + employee.salary);
    }
}

//      Output
//        Employee ID : 3 Name : Vimal Age : 25 Salary : 47000