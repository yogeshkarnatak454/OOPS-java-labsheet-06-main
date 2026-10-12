abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double monthlySalary;
    private double bonus;

    Manager(String name, int id, double monthlySalary, double bonus) {
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Manager");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: %.2f%n", calculateSalary());
    }
}

class Programmer extends Employee {
    private double monthlySalary;
    private double projectBonus;

    Programmer(String name, int id, double monthlySalary, double projectBonus) {
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.projectBonus = projectBonus;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + projectBonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Programmer");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: %.2f%n", calculateSalary());
    }
}

public class Q10_AbstractEmployeeManagerProgrammer {
    public static void main(String[] args) {
        Employee manager = new Manager("Priya", 101, 60000, 10000);
        Employee programmer = new Programmer("Aman", 102, 45000, 5000);
        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}
