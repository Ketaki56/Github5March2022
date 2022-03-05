package Polymorphism;

public class Bike {
    int speed = 100;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class pulsar extends Bike{
    int speed = 80;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class honda extends Bike{
    int speed = 90;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Bike bike = new pulsar();
        bike.display();

        Bike bike1 = new honda();
        bike1.display();
    }
}
