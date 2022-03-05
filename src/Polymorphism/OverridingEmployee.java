package Polymorphism;

public class OverridingEmployee {
    double salary = 50000;

}

class Developer extends OverridingEmployee {
    double salary = 45000;

    double calculateSalary() {
        double totalSalary = 5000 + salary;
        return totalSalary;

    }

    void printSalary() {
        System.out.println("Salary is " + calculateSalary());
    }
}

class Tester extends OverridingEmployee {
    double salary = 30000;

    double calculateSalary() {
        double totalSalary = 1000 + salary;
        return totalSalary;
    }

    void printSalary() {
        System.out.println("Salary is " + calculateSalary());
    }
}

class OverridingEmployeeImpl {
    public static void main(String[] args) {
        Developer dv = new Developer();
        dv.printSalary();

        Tester tv = new Tester();
        tv.printSalary();
    }
}
