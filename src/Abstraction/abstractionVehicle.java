package Abstraction;

public abstract class abstractionVehicle {
    int Wheels;
    abstract void start();

    static void show(){
        System.out.println("in static method");
    }

    final void display(){
        System.out.println("in display method");
    }

    void stop(){
        System.out.println("in stop method");
    }

}
