package Level_1;

public class Employee {
    private String name;
    private double salary;
    private int ID;

    public Employee(String nm, double sal, int id) {
        this.name = nm;
        this.salary = sal;
        this.ID = id;
    }

    public double calculateYearlySalary() {
        return this.salary * 12;
    }

    public void printSalary() {
        System.out.println("Employee ID: " + ID + ", Employee Name: " + name + ", Salary: $" + salary);
    }

    public void printYearlySalary() {
        double yearlySalary = calculateYearlySalary();
        System.out.println("Yearly Salary: " + yearlySalary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Shubh", 500000.00, 2197);
        employee1.printSalary();
        employee1.printYearlySalary();
    }
}
