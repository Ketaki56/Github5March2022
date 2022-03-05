package Inheritance;

import java.util.Scanner;

public class Employee1 {
    int id;
    String name;
    String mobile;
    String email;
}

class Developer extends Employee1 {
    String designation;

    void insertData(int i, String n, String m, String e) {
        id = i;
        name = n;
        mobile = m;
        email = e;

    }

    void display() {
        System.out.println("Details is " +id);
        System.out.println("Details is " +name);
        System.out.println("Details is " +mobile);
        System.out.println("Details is " +email);
    }
}

class Tester extends Employee1 {
    String designation;

    void insertData(int i, String n, String m, String e) {
        id = i;
        name = n;
        mobile = m;
        email = e;
    }

    void display() {
        System.out.println("Tester Details is " + id);
        System.out.println("Tester Details is " + name);
        System.out.println("Tester details is " + mobile);
        System.out.println("Tester Details is " + email);
    }
}

class Employee1Impl {
    public static void main(String[] args) {
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.insert Data");
            System.out.println("2.display Data");
            System.out.println("3.exit Data");
            System.out.println("Enter your choice");

            ch = sc.nextInt();
            Developer employee1 = new Developer();
            Tester tester = new Tester();
            switch (ch) {
                case 1:
                    System.out.println("insert Data for developer");
                    System.out.println("Enter id");
                    employee1.id = sc.nextInt();
                    System.out.println("Enter name");
                    employee1.name = sc.next();
                    System.out.println("Enter mobile no");
                    employee1.mobile = sc.next();
                    System.out.println("Enter email id");
                    employee1.email = sc.next();
                    employee1.insertData(employee1.id, employee1.name, employee1.mobile, employee1.email);
                    break;
                case 2:
                    System.out.println("Display Data for Developer");
                    employee1.display();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!!");

            }


        } while (ch < 4);


    }
}