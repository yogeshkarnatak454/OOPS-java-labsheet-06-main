class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing human resources");
    }

    void addEmployee(String name) {
        System.out.println(name + " has been added as an employee");
    }
}

public class Q04_EmployeeHRManager {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee("Rahul");
    }
}
