package Abstraction;

public class abstractionCar extends abstractionVehicle {
    int Wheels = 4;

    void start() {
        System.out.println("start with key");
    }

}

class Bike extends abstractionVehicle {
    int Wheels = 2;

    void start() {
        System.out.println("start with button");
    }
}

class abstractionVehicleImpl {
    public static void main(String[] args) {
        abstractionVehicle vehicle; // reference object/variable
        vehicle = new abstractionCar();
        vehicle.start();
        System.out.println(vehicle.Wheels);

        vehicle = new Bike();
        vehicle.start();
        System.out.println(vehicle.Wheels);

        vehicle.display();
        vehicle.stop();
        vehicle.show();

    }
}