package Inheritance;

public class Employee {
    double salary = 20000;

    void display() {
        System.out.println("Salary " + salary);
    }

}

class PermanentEmployee extends Employee {
    double hike = 1.5;

    void calculateTotalSalary() {
        double salary1 = salary + (salary * hike / 100);
        System.out.println("Calculate Total Salary " + salary1);
    }
}

class TemporaryEmployee extends Employee {
    double hike = 0.5;

    void calculateTotalSalary() {
        double salary2 = salary + (salary * hike / 100);
        System.out.println("Calculate Total Area " + salary2);
    }
}

class EmployeeImpl {
    public static void main(String[] args) {
        PermanentEmployee pt = new PermanentEmployee();
        pt.calculateTotalSalary();

        TemporaryEmployee tp = new TemporaryEmployee();
        tp.calculateTotalSalary();

    }
}
